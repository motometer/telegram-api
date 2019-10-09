package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#audio">Audio</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableAudio.Builder.class)
public interface Audio extends Attachment {

    @JsonProperty("duration")
    int duration();

    @Nullable
    @JsonProperty("performer")
    String performer();

    @Nullable
    @JsonProperty("title")
    String title();
}
