package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#animation">Animation</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableAnimation.Builder.class)
public interface Animation extends Attachment {

    @JsonProperty("width")
    long width();

    @JsonProperty("height")
    long height();

    @JsonProperty("duration")
    long duration();

    @Nullable
    @JsonProperty("file_name")
    String fileName();
}
