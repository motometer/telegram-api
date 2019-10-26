package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

import javax.annotation.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#videonote">VideoNote</a>
 */
@Value.Immutable
public interface VideoNote extends File {

    @Gson.Named("length")
    long length();

    @Gson.Named("duration")
    long duration();

    @Nullable
    @Gson.Named("thumb")
    PhotoSize thumb();
}
