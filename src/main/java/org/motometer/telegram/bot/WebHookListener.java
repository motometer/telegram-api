package org.motometer.telegram.bot;

import org.motometer.telegram.bot.api.Update;

/**
 * Listener that receives {@link Update} events from telegram webhook as non parsed {@link String}.
 * @see <a href="https://core.telegram.org/bots/api#setwebhook">setWebhook</a>
 * @see UpdateListener
 */
@FunctionalInterface
public interface WebHookListener extends EventListener<String> {

    /**
     * Raw json payload that Telegram API sends to provided webhook.
     * @param event value to be parsed
     */
    @Override
    void onEvent(String event) throws BotException;
}
