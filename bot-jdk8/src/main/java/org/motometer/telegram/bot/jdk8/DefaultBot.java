package org.motometer.telegram.bot.jdk8;

import lombok.RequiredArgsConstructor;
import org.motometer.telegram.bot.Bot;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;
import org.motometer.telegram.bot.api.message.Message;
import org.motometer.telegram.bot.api.method.SendMessage;

import java.util.List;


@RequiredArgsConstructor
class DefaultBot implements Bot {

    private final BotTemplate botTemplate;

    @Override
    public User me() {
        return botTemplate.execute(Method.ME);
    }

    @Override
    public List<Update> updates() {
        return botTemplate.execute(Method.UPDATES);
    }

    @Override
    public Message sendMessage(SendMessage message) {
        return botTemplate.execute(message, Method.SEND_MESSAGE);
    }
}
