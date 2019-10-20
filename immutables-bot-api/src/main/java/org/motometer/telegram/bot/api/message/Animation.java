package org.motometer.telegram.bot.api.message;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#animation">Animation</a>
 */
@Value.Immutable
public interface Animation extends Attachment {

    long width();

    long height();

    long duration();

    @Nullable
    @Gson.Named("file_name")
    String fileName();
}
