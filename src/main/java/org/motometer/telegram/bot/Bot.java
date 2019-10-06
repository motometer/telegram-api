package org.motometer.telegram.bot;

import java.util.List;

import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.method.SendMessage;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;
import org.motometer.telegram.bot.client.BotBuilder;

/**
 * Representation of Telegram Bot.
 * Provides bot API methods.
 * @see <a href="https://core.telegram.org/bots/api">Telegram Bot API</a>
 */
public interface Bot {

    /**
     * @see <a href="https://core.telegram.org/bots/api#getme">getMe</a>
     * @return {@link User}
     */
    User me();

    List<Update> updates();

    Message sendMessage(SendMessage message);

    static BotBuilder builder() {
        return new BotBuilder();
    }
}
