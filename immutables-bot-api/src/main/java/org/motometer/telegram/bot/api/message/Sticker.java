package org.motometer.telegram.bot.api.message;

import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#sticker">Sticker</a>
 */
@Value.Immutable
public interface Sticker extends File {

    long width();

    long height();

    boolean isAnimated();

    @Nullable
    PhotoSize thumb();

    @Nullable
    String emoji();

    @Nullable
    String setName();

    @Nullable
    MaskPosition maskPosition();
}
