package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#photosize">PhotoSize</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutablePhotoSize.Builder.class)
public interface PhotoSize {

    @JsonProperty("file_id")
    String fileId();

    @JsonProperty("width")
    int width();

    @JsonProperty("height")
    int height();

    @JsonProperty("file_size")
    int fileSize();
}
