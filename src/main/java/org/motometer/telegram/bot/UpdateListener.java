package org.motometer.telegram.bot;

import org.motometer.telegram.bot.api.Update;

public interface UpdateListener {

    void onUpdate(Update update);
}
