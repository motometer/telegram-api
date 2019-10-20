package org.motometer.telegram.bot.jdk8;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.motometer.telegram.bot.TelegramApiException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RequiredArgsConstructor
class BotTemplate {

    private static final int HTTP_SUCCESS = 200;
    private final HttpClient httpClient = HttpClient.newBuilder().build();

    private final String baseUri;
    private final Gson gson;

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
            TypeAdapter<ApiResponse<T>> adapter = gson.getAdapter(method.getTypeToken());
            final ApiResponse<T> response = adapter.fromJson(new InputStreamReader(send.body()));
            return checkError(response);
        } catch (final IOException | InterruptedException ex) {
            throw new TelegramApiException(ex);
        }
    }

    private void checkError(HttpResponse<InputStream> response) {
        if (response.statusCode() != HTTP_SUCCESS) {
            throw new TelegramApiException("API returned status code = " + response.statusCode());
        }
    }

    private <T> T checkError(final ApiResponse<T> response) {
        if (response.isOk()) {
            return response.result();
        }
        throw new TelegramApiException(response.description());
    }

    @SneakyThrows
    private <T> HttpRequest request(String method, T body) {
        return newBuilder(method)
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(body)))
            .build();
    }

    private HttpRequest.Builder newBuilder(String method) throws URISyntaxException {
        return HttpRequest.newBuilder()
            .uri(new URI(baseUri + method));
    }

    @SneakyThrows
    private HttpRequest request(String method) {
        return newBuilder(method)
            .GET()
            .build();
    }
}
