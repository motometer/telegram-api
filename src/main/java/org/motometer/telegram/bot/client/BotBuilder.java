package org.motometer.telegram.bot.client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.motometer.telegram.bot.Bot;

import static java.util.Objects.requireNonNull;

public class BotBuilder {

    private static final String DEFAULT_HOST = "https://api.telegram.org";
    private final BotTemplate.BotTemplateBuilder builder;
    private String token;
    private String host;

    public BotBuilder() {
        builder = BotTemplate.builder();
        ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);
        builder.objectMapper(objectMapper);
        host = DEFAULT_HOST;
    }

    public Bot build() {
        builder.baseUri(baseUri());
        return new DefaultBot(builder.build());
    }

    private String baseUri() {
        return host + "/bot" + requireNonNull(token) + "/";
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
