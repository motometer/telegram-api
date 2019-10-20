package org.motometer.telegram.bot.api.message;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#voice">Voice</a>
 */
@Value.Immutable
public interface Voice extends File {

    long duration();

    @Nullable
    @Gson.Named("mime_type")
    String mimeType();
}
