package org.motometer.telegram.bot;

import lombok.RequiredArgsConstructor;
import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.OutboundMessage;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;
import org.motometer.telegram.bot.client.GenericBot;
import org.motometer.telegram.bot.client.Method;

import java.util.List;

@RequiredArgsConstructor
class DefaultBot implements Bot {

    private final GenericBot genericClient;

    @Override
    public User me() {
        return genericClient.execute(Method.ME).result();
    }

    @Override
    public List<Update> updates() {
        return genericClient.execute(Method.UPDATES).result();
    }

    @Override
    public Message sendMessage(OutboundMessage message) {
        return genericClient.execute(message, Method.SEND_MESSAGE).result();
    }
}
