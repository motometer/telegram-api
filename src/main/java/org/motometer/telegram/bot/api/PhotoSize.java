package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#photosize">PhotoSize</a>
 */
@Value.Immutable
public interface PhotoSize extends File {

    @Gson.Named("width")
    long width();

    @Gson.Named("height")
    long height();

    @Override
    @Gson.Named("file_size")
    Long fileSize();
}
