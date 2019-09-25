package org.motometer.telegram.bot;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BotIT extends AbstractBotIT {

    @Test
    @Disabled
    void getMe() {
        User user = bot.me();

        assertThat(user.id()).isGreaterThan(0);
        assertThat(user.firstName()).isNotNull();
        assertThat(user.isBot()).isTrue();
    }

    @Test
    void updates() {
        List<Update> updates = bot.updates();

        assertThat(updates).isNotNull();
    }
}