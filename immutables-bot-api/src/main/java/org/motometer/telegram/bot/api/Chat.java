package org.motometer.telegram.bot.api;

import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#chat">Chat</a>
 */
@Value.Immutable
public interface Chat {

    long id();

    ChatType type();
}
