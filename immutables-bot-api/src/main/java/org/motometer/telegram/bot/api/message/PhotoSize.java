package org.motometer.telegram.bot.api.message;

import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#photosize">PhotoSize</a>
 */
@Value.Immutable
public interface PhotoSize extends File {

    long width();

    long height();
}
