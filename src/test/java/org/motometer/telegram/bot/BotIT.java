package org.motometer.telegram.bot;

import org.junit.jupiter.api.Test;
import org.motometer.telegram.bot.api.ImmutableOutboundMessage;
import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;

import java.util.List;
import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.Assertions.assertThat;

//@Disabled
class BotIT extends AbstractBotIT {

    @Test
    void getMe() throws ExecutionException, InterruptedException {
        User user = bot.me().get();

        assertThat(user.id()).isGreaterThan(0);
        assertThat(user.firstName()).isNotNull();
        assertThat(user.isBot()).isTrue();
    }

    @Test
    void updates() throws ExecutionException, InterruptedException {
        List<Update> updates = bot.updates().get();

        assertThat(updates).isNotNull();
    }

    @Test
    void sendMessage() throws ExecutionException, InterruptedException {
        ImmutableOutboundMessage build = new ImmutableOutboundMessage.Builder()
            .chatId(251525873)
            .text("Ну Любашка")
            .build();

        Message message = bot.sendMessage(build).get();

        assertThat(message).isNotNull();
    }
}