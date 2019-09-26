package org.motometer.telegram.bot;

import java.util.List;

import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.OutboundMessage;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;
import org.motometer.telegram.bot.client.BotBuilder;

public interface Bot {

    User me();

    List<Update> updates();

    Message sendMessage(OutboundMessage message);

    static BotBuilder builder() {
        return new BotBuilder();
    }
}
