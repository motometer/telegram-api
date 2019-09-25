package org.motometer.telegram.bot.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.motometer.telegram.bot.TelegramApiException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Builder
public class GenericBot {

    private final ObjectMapper objectMapper;
    private final String token;
    private final HttpClient httpClient = HttpClient.newBuilder().build();

    public <T, R> R execute(T requestBody, Method<R> method) {
        HttpRequest request = request(method.getValue(), requestBody);
        return execute(method, request);
    }

    public <T> T execute(Method<T> method) {
        return execute(method, request(method.getValue()));
    }

    private <T> T execute(Method<T> method, HttpRequest request) {
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            String body = response.body();

            T result = objectMapper.readValue(body, method.getTypeReference());
            return result;
        } catch (IOException | InterruptedException e) {
            throw new TelegramApiException(e);
        }
    }

    @SneakyThrows
    private <T> HttpRequest request(String method, T body) {
        String requestBody = objectMapper.writeValueAsString(body);
        System.out.println(requestBody);
        return HttpRequest.newBuilder()
            .uri(newUri(method))
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(requestBody))
            .build();
    }

    private HttpRequest request(String method) {
        return HttpRequest.newBuilder()
            .uri(newUri(method))
            .GET()
            .build();
    }

    @SneakyThrows
    private URI newUri(String method) {
        return new URI("https://api.telegram.org/bot" + token + "/" + method);
    }
}
