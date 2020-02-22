package org.motometer.telegram.bot;

import org.motometer.telegram.bot.api.CallbackQueryAnswer;
import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;
import org.motometer.telegram.bot.api.SendMessage;

import java.util.List;

/**
 * Representation of Telegram Bot.
 * Provides bot API methods.
 *
 * @see <a href="https://core.telegram.org/bots/api">Telegram Bot API</a>
 */
public interface Bot {

    /**
     * @return {@link User}
     * @see <a href="https://core.telegram.org/bots/api#getme">getMe</a>
     */
    User me() throws BotException;

    /**
     * @return {@link Update}
     * @see <a href="https://core.telegram.org/bots/api#getupdates">getUpdates</a>
     */
    List<Update> updates() throws BotException;

    /**
     * @param message request entity
     * @return {@link Message}
     * @see <a href="https://core.telegram.org/bots/api#sendmessage">sendMessage</a>
     */
    Message sendMessage(SendMessage message) throws BotException;

    /**
     *
     * @param answer request entity
     * @return On success, True is returned.
     * @see <a href="https://core.telegram.org/bots/api#answercallbackquery">answerCallbackQuery</a>
     * @throws BotException on failure
     */
    boolean answerCallbackQuery(CallbackQueryAnswer answer) throws BotException;
}
