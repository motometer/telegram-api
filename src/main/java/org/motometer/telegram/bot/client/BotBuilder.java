package org.motometer.telegram.bot.client;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.motometer.telegram.bot.Bot;

public class BotBuilder {

    private final GenericBot.GenericBotBuilder builder;

    public BotBuilder() {
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
}
