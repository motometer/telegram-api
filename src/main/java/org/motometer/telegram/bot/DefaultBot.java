package org.motometer.telegram.bot;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.SneakyThrows;
import org.motometer.telegram.bot.api.Me;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Builder
class DefaultBot implements Bot {

    private static final TypeReference<Me> ME_TYPE = new TypeReference<>() { };
    private static final TypeReference<List<Update>> UPDATES_TYPE = new TypeReference<>() { };

    private final ObjectMapper objectMapper;
    private final String token;

    private final HttpClient httpClient = HttpClient.newBuilder().build();

    @Override
    public User me() {
        return execute("getMe", ME_TYPE).result();
    }

    @Override
    public List<Update> updates() {
        return execute("getUpdates", UPDATES_TYPE);
    }

    private <T> T execute(String method, TypeReference<T> responseType) {
        try {
            HttpResponse<String> response = httpClient.send(request(method), HttpResponse.BodyHandlers.ofString());

            String body = response.body();

            return objectMapper.readValue(body, responseType);
        } catch (IOException | InterruptedException e) {
            throw new TelegramApiException(e);
        }
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
