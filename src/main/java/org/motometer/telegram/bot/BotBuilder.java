package org.motometer.telegram.bot;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BotBuilder {

    private final DefaultBot.DefaultBotBuilder builder;

    BotBuilder() {
        builder = new DefaultBot.DefaultBotBuilder();
        ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        builder.objectMapper(objectMapper);
    }

    public Bot build() {
        return builder.build();
    }

    public BotBuilder token(String token) {
        builder.token(token);
        return this;
    }

    public BotBuilder objectMapper(ObjectMapper objectMapper) {
        builder.objectMapper(objectMapper);
        return this;
    }
}
