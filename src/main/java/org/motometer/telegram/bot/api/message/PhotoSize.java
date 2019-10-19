package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#photosize">PhotoSize</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutablePhotoSize.Builder.class)
public interface PhotoSize extends File {

    @JsonProperty("width")
    long width();

    @JsonProperty("height")
    long height();

    @Override
    @JsonProperty("file_size")
    Long fileSize();
}
