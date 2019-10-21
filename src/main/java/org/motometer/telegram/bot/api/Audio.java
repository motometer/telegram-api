package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#audio">Audio</a>
 */
@Value.Immutable
public interface Audio extends Attachment {

    @Gson.Named("duration")
    long duration();

    @Nullable
    @Gson.Named("performer")
    String performer();

    @Nullable
    @Gson.Named("title")
    String title();
}
