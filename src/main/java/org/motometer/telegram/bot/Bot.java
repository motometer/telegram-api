package org.motometer.telegram.bot;

import org.motometer.telegram.bot.api.User;

public interface Bot {

    User getMe();

    static BotBuilder builder() {
        return new BotBuilder();
    }
}
