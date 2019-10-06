package org.motometer.telegram.bot;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;
import org.motometer.telegram.bot.api.method.ImmutableSendMessage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Disabled
class BotIT extends AbstractBotIT {

    @Test
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

    @Test
    void sendMessage() {
        ImmutableSendMessage build = new ImmutableSendMessage.Builder()
            .chatId(1)
            .text("Hello")
            .build();

        Message message = bot.sendMessage(build);

        assertThat(message).isNotNull();
    }
}