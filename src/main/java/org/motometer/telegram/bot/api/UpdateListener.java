package org.motometer.telegram.bot.api;

import org.motometer.telegram.bot.api.update.Update;

/**
 * Listener that receives update from telegram webhook.
 * @see <a href="https://core.telegram.org/bots/api#setwebhook">setWebhook</a>
 */
public interface UpdateListener {

    void onUpdate(Update update);
}
