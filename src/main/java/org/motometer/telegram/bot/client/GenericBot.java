package org.motometer.telegram.bot.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

import org.motometer.telegram.bot.TelegramApiException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Builder;
import lombok.SneakyThrows;

@Builder
class GenericBot {

    private final ObjectMapper objectMapper;
    private final String token;
    private final HttpClient httpClient = HttpClient.newBuilder().build();

    <T, R> CompletableFuture<R> execute(T requestBody, Method<R> method) {
        HttpRequest request = request(method.getValue(), requestBody);
        return execute(method, request);
    }

    <T> CompletableFuture<T> execute(Method<T> method) {
        return execute(method, request(method.getValue()));
    }

    private <T> CompletableFuture<T> execute(Method<T> method, HttpRequest request) {
        return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .thenApply(HttpResponse::body)
            .thenApply(v -> {
                try {
                    final TypeReference<ApiResponse<T>> typeReference = method.getTypeReference();
                    final ApiResponse<T> t = objectMapper.readValue(v, typeReference);
                    return checkError(t);
                } catch (IOException e) {
                    throw new TelegramApiException(e);
                }
            });
    }

    private <T> T checkError(final ApiResponse<T> response) {
        if (response.isOk()) {
            return response.getResult();
        }
        throw new TelegramApiException(response.getDescription());
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
