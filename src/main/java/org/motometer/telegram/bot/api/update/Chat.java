package org.motometer.telegram.bot.api.update;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#chat">Chat</a>
 */
@Value.Immutable
public interface Chat {

    @Gson.Named("id")
    long id();

    @Gson.Named("type")
    ChatType type();
}
