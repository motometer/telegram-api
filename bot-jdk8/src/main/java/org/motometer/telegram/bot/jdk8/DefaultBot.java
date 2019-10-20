package org.motometer.telegram.bot.jdk8;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.motometer.telegram.bot.Bot;
import org.motometer.telegram.bot.UpdateListener;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;
import org.motometer.telegram.bot.api.message.Message;
import org.motometer.telegram.bot.api.method.SendMessage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@RequiredArgsConstructor
class DefaultBot implements Bot {

    private final BotTemplate botTemplate;
    private final List<UpdateListener> listeners = Collections.synchronizedList(new ArrayList<>());
    private final Gson gson;

    @Override
    public Update parseUpdate(String input) {
        return gson.fromJson(input, Update.class);
    }

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
