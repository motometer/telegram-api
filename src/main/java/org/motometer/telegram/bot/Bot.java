package org.motometer.telegram.bot;

import org.motometer.telegram.bot.api.message.Message;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;
import org.motometer.telegram.bot.api.method.SendMessage;
import org.motometer.telegram.bot.client.BotBuilder;

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
    User me();

    /**
     * @return {@link Update}
     * @see <a href="https://core.telegram.org/bots/api#getupdates">getUpdates</a>
     */
    List<Update> updates();

    /**
     * @param message request entity
     * @return {@link Message}
     * @see <a href="https://core.telegram.org/bots/api#sendmessage">sendMessage</a>
     */
    Message sendMessage(SendMessage message);

    static BotBuilder builder() {
        return new BotBuilder();
    }
}
