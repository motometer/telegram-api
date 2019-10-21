package org.motometer.telegram.bot;

import org.motometer.telegram.bot.api.Update;

/**
 * Listener that receives update from telegram webhook.
 * @see <a href="https://core.telegram.org/bots/api#setwebhook">setWebhook</a>
 */
public interface UpdateListener {

    void onUpdate(Update update);
}
