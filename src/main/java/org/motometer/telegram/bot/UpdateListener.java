package org.motometer.telegram.bot;

import org.motometer.telegram.bot.api.Update;

/**
 * Listener that receives {@link Update} events from telegram webhook.
 * @see <a href="https://core.telegram.org/bots/api#setwebhook">setWebhook</a>
 * @see WebHookListener
 */
@FunctionalInterface
public interface UpdateListener extends EventListener<Update> {

    @Override
    void onEvent(Update event);
}
