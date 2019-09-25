package org.motometer.telegram.bot;

import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;

import java.util.List;

public interface Bot {

    User me();

    List<Update> updates();

    static BotBuilder builder() {
        return new BotBuilder();
    }
}
