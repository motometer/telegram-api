package org.motometer.telegram.bot.client;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.motometer.telegram.bot.Bot;

public class BotBuilder {

    private static final String DEFAULT_HOST = "https://api.telegram.org";
    private final TelegramClient.TelegramClientBuilder builder;
    private String token;
    private String host;

    public BotBuilder() {
        builder = TelegramClient.builder();
        ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        builder.objectMapper(objectMapper);
        host = DEFAULT_HOST;
    }

    public Bot build() {
        builder.baseUri(baseUri());
        return new DefaultBot(builder.build());
    }

    private String baseUri() {
        return host + "/bot" + token + "/";
    }

    public BotBuilder token(String token) {
        this.token = token;
        return this;
    }

    public BotBuilder apiHost(String host) {
        this.host = host;
        return this;
    }
}
