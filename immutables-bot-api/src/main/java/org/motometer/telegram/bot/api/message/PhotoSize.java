package org.motometer.telegram.bot.api.message;

/**
 * @see <a href="https://core.telegram.org/bots/api#photosize">PhotoSize</a>
 */
public interface PhotoSize extends File {

    long width();

    long height();

    @Override
    Long fileSize();
}
