package org.motometer.telegram.bot;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.SneakyThrows;
import org.motometer.telegram.bot.api.Me;
import org.motometer.telegram.bot.api.User;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Builder
class DefaultBot implements Bot {

    private final ObjectMapper objectMapper;
    private final String token;

    @Override
    public User getMe() {
        HttpClient httpClient = HttpClient.newBuilder().build();
        try {
            HttpResponse<String> response = httpClient.send(request(), HttpResponse.BodyHandlers.ofString());

            String body = response.body();

            Me result = objectMapper.readValue(body, Me.class);
            return result.result();
        } catch (IOException | InterruptedException e) {
            throw new TelegramApiException(e);
        }
    }

    private HttpRequest request() {
        return HttpRequest.newBuilder()
            .uri(newUri("getMe"))
            .GET()
            .build();
    }

    @SneakyThrows
    private URI newUri(String method) {
        return new URI("https://api.telegram.org/bot" + token + "/" + method);
    }
}
