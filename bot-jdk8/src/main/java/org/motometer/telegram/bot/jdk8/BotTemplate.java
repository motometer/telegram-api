package org.motometer.telegram.bot.jdk8;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import lombok.RequiredArgsConstructor;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.HttpResponse;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.util.StringContentProvider;
import org.eclipse.jetty.http.HttpMethod;
import org.motometer.telegram.bot.TelegramApiException;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@RequiredArgsConstructor
class BotTemplate {

    private static final int HTTP_SUCCESS = 200;
    private final HttpClient httpClient = new HttpClient();

    private final String baseUri;
    private final Gson gson;

    <T, R> R execute(T requestBody, Method<R> method) {
        Request request = request(method.getValue(), requestBody);
        return execute(method, request);
    }

    <T> T execute(Method<T> method) {
        return execute(method, request(method.getValue()));
    }

    private <T> T execute(Method<T> method, Request request) {
        try {
            ContentResponse send = request.send();
            TypeAdapter<ApiResponse<T>> adapter = gson.getAdapter(method.getTypeToken());
            final ApiResponse<T> response = adapter.fromJson(send.getContentAsString());
            return checkError(response);
        } catch (final IOException | InterruptedException | TimeoutException | ExecutionException ex) {
            throw new TelegramApiException(ex);
        }
    }

    private void checkError(HttpResponse response) {
        if (response.getStatus() != HTTP_SUCCESS) {
            throw new TelegramApiException("API returned status code = " + response.getStatus());
        }
    }

    private <T> T checkError(final ApiResponse<T> response) {
        if (response.isOk()) {
            return response.result();
        }
        throw new TelegramApiException(response.description());
    }

    private <T> Request request(String method, T body) {
        return httpClient.POST(baseUri + method)
            .header("Content-Type", "application/json")
            .content(new StringContentProvider(gson.toJson(body)));
    }

    private Request request(String method) {
        return httpClient.newRequest(baseUri + method)
            .method(HttpMethod.GET);
    }
}
