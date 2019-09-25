package org.motometer.telegram.bot;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.motometer.telegram.bot.client.GenericBot;

public class BotBuilder {

    private final GenericBot.GenericBotBuilder builder;

    BotBuilder() {
        builder = GenericBot.builder();
        ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        builder.objectMapper(objectMapper);
    }

    public Bot build() {
        return new DefaultBot(builder.build());
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
