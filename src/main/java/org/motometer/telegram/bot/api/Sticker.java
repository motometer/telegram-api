package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#sticker">Sticker</a>
 */
@Value.Immutable
public interface Sticker extends File {

    @Gson.Named("width")
    long width();

    @Gson.Named("height")
    long height();

    @Gson.Named("is_animated")
    boolean isAnimated();

    @Nullable
    @Gson.Named("thumb")
    PhotoSize thumb();

    @Nullable
    @Gson.Named("emoji")
    String emoji();

    @Nullable
    @Gson.Named("set_name")
    String setName();

    @Nullable
    @Gson.Named("mask_position")
    MaskPosition maskPosition();
}
