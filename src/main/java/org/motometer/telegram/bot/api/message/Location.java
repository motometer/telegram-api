package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#location">Location</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableLocation.Builder.class)
public interface Location {

    @Value.Parameter
    @JsonProperty("longitude")
    double longitude();

    @Value.Parameter
    @JsonProperty("latitude")
    double latitude();
}
