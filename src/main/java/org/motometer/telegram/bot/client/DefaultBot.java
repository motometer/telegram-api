package org.motometer.telegram.bot.client;

import java.util.List;

import org.motometer.telegram.bot.Bot;
import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.method.SendMessage;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class DefaultBot implements Bot {

    private final TelegramClient genericClient;

    @Override
    public User me() {
        return genericClient.execute(Method.ME);
    }

    @Override
    public List<Update> updates() {
        return genericClient.execute(Method.UPDATES);
    }

    @Override
    public Message sendMessage(SendMessage message) {
        return genericClient.execute(message, Method.SEND_MESSAGE);
    }
}
