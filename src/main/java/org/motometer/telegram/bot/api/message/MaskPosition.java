package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#maskposition">MaskPosition</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableMaskPosition.Builder.class)
public interface MaskPosition {

    @JsonProperty("point")
    String point();

    @JsonProperty("x_shift")
    double xShift();

    @JsonProperty("y_shift")
    double yShift();

    @JsonProperty("scale")
    double scale();
}
