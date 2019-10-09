package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#video">Video</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableVideo.Builder.class)
public interface Video extends Attachment {

    @JsonProperty("width")
    int width();

    @JsonProperty("height")
    int height();

    @JsonProperty("duration")
    int duration();
}
