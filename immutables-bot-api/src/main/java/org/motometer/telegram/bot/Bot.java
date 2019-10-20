package org.motometer.telegram.bot;

import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;
import org.motometer.telegram.bot.api.message.Message;
import org.motometer.telegram.bot.api.method.SendMessage;

import java.util.List;

/**
 * Representation of Telegram Bot.
 * Provides bot API methods.
 *
 * @see <a href="https://core.telegram.org/bots/api">Telegram Bot API</a>
 */
public interface Bot {

    /**
     * Handles input stream of the input request to provided webhook
     * @see <a href="https://core.telegram.org/bots/api#getting-updates">Getting updates</a>
     * Calls {@link UpdateListener#onUpdate(Update)} once request is successully parsed
     * @param input json payload of with the entity of {@link Update}
     */
    void handleWebhook(String input);

    /**
     * Registers new {@link UpdateListener} to this bot.
     * @param listener
     */
    void addUpdateListener(UpdateListener listener);

    boolean removeListener(UpdateListener listener);

    /**
     * @return {@link User}
     * @see <a href="https://core.telegram.org/bots/api#getme">getMe</a>
     */
    User me() throws TelegramApiException;

    /**
     * @return {@link Update}
     * @see <a href="https://core.telegram.org/bots/api#getupdates">getUpdates</a>
     */
    List<Update> updates() throws TelegramApiException;

    /**
     * @param message request entity
     * @return {@link Message}
     * @see <a href="https://core.telegram.org/bots/api#sendmessage">sendMessage</a>
     */
    Message sendMessage(SendMessage message) throws TelegramApiException;
}
