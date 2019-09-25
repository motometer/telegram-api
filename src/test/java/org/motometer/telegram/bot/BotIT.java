package org.motometer.telegram.bot;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.motometer.telegram.bot.api.User;

import static org.assertj.core.api.Assertions.assertThat;

class BotIT extends AbstractBotIT {

    @Test
    @Disabled
    void getMe() {
        User user = bot.getMe();

        assertThat(user.id()).isEqualTo(908541514);
    }
}