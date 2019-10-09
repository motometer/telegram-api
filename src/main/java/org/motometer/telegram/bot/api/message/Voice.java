package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#voice">Voice</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableVoice.Builder.class)
public interface Voice {

    @JsonProperty("file_id")
    String fileId();

    @JsonProperty("duration")
    int duration();

    @Nullable
    @JsonProperty("mime_type")
    String mimeType();

    @Nullable
    @JsonProperty("file_size")
    Integer fileSize();
}
