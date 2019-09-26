package org.motometer.telegram.bot.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.motometer.telegram.bot.TelegramApiException;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Builder;
import lombok.SneakyThrows;

@Builder
class GenericBot {

    private final ObjectMapper objectMapper;
    private final String token;
    private final HttpClient httpClient = HttpClient.newBuilder().build();

    <T, R> R execute(T requestBody, Method<R> method) {
        HttpRequest request = request(method.getValue(), requestBody);
        return execute(method, request);
    }

    <T> T execute(Method<T> method) {
        return execute(method, request(method.getValue()));
    }

    private <T> T execute(Method<T> method, HttpRequest request) {

        try {
            HttpResponse<InputStream> send = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());
            checkError(send);
            final ApiResponse<T> t = objectMapper.readValue(send.body(), method.getTypeReference());
            return checkError(t);
        } catch (IOException | InterruptedException e) {
            throw new TelegramApiException(e);
        }
    }

    private void checkError(HttpResponse<InputStream> response) {
        if (response.statusCode() != 200) {
            throw new TelegramApiException("API returned status code = " + response.statusCode());
        }
    }

    private <T> T checkError(final ApiResponse<T> response) {
        if (response.isOk()) {
            return response.getResult();
        }
        throw new TelegramApiException(response.getDescription());
    }

    @SneakyThrows
    private <T> HttpRequest request(String method, T body) {
        return HttpRequest.newBuilder()
            .uri(newUri(method))
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofByteArray(objectMapper.writeValueAsBytes(body)))
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
