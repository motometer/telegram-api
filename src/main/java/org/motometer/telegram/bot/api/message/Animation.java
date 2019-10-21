package org.motometer.telegram.bot.api.message;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#animation">Animation</a>
 */
@Value.Immutable
public interface Animation extends Attachment {

    @Gson.Named("width")
    long width();

    @Gson.Named("height")
    long height();

    @Gson.Named("duration")
    long duration();

    @Nullable
    @Gson.Named("file_name")
    String fileName();
}
