package org.motometer.telegram.bot.jdk8;

import org.junit.jupiter.api.Test;
import org.motometer.telegram.bot.Bot;
import org.motometer.telegram.bot.api.Update;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DefaultBotTest {

    @Test
    void updates() {
        Bot bot = new BotBuilder()
            .token(System.getProperty("telegram.bot.token"))
            .build();

        List<Update> updates = bot.updates();

        assertThat(updates).isNotEmpty();
    }
}