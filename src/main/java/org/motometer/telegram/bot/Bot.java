package org.motometer.telegram.bot;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.OutboundMessage;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;
import org.motometer.telegram.bot.client.BotBuilder;

public interface Bot {

    CompletableFuture<User> me();

    CompletableFuture<List<Update>> updates();

    CompletableFuture<Message> sendMessage(OutboundMessage message);

    static BotBuilder builder() {
        return new BotBuilder();
    }
}
