package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#videonote">VideoNote</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableVideoNote.Builder.class)
public interface VideoNote extends File {

    @JsonProperty("length")
    int length();

    @JsonProperty("duration")
    int duration();

    @Nullable
    @JsonProperty("thumb")
    PhotoSize thumb();
}
