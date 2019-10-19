package org.motometer.telegram.bot.api;

/**
 * @see <a href="https://core.telegram.org/bots/api#chat">Chat</a>
 */
public interface Chat {

    long id();

    ChatType type();
}
