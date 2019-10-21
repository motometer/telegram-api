package org.motometer.telegram.bot;

import java.util.Objects;

abstract class AbstractBotIT {

    final Bot bot;

    AbstractBotIT() {
        final String token = Objects.requireNonNull(System.getProperty("telegram.bot.token"));
        bot = Bot.builder()
            .token(token)
            .build();
    }
}
