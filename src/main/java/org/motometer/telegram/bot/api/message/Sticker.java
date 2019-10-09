package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#sticker">Sticker</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableSticker.Builder.class)
public interface Sticker extends File {

    @JsonProperty("width")
    long width();

    @JsonProperty("height")
    long height();

    @JsonProperty("is_animated")
    boolean isAnimated();

    @Nullable
    @JsonProperty("thumb")
    PhotoSize thumb();

    @Nullable
    @JsonProperty("emoji")
    String emoji();

    @Nullable
    @JsonProperty("set_name")
    String setName();

    @Nullable
    @JsonProperty("mask_position")
    MaskPosition maskPosition();
}
