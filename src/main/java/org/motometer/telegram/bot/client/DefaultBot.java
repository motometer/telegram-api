package org.motometer.telegram.bot.client;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.motometer.telegram.bot.Bot;
import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.OutboundMessage;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class DefaultBot implements Bot {

    private final GenericBot genericClient;

    @Override
    public CompletableFuture<User> me() {
        return genericClient.execute(Method.ME);
    }

    @Override
    public CompletableFuture<List<Update>> updates() {
        return genericClient.execute(Method.UPDATES);
    }

    @Override
    public CompletableFuture<Message> sendMessage(OutboundMessage message) {
        return genericClient.execute(message, Method.SEND_MESSAGE);
    }
}
