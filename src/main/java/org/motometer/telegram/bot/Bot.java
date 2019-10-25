package org.motometer.telegram.bot;

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
     * Factory method that creates adapter for {@link WebHookListener}
     * @param listener {@link UpdateListener#onEvent(Update)} will be called after
     *                                                       {@link WebHookListener#onEvent(String)}
     * @return {@link WebHookListener#onEvent(String)}
     */
    WebHookListener adaptListener(UpdateListener listener);

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
}
