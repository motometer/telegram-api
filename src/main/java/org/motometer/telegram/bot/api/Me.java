package org.motometer.telegram.bot.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(builder = ImmutableMe.Builder.class)
public interface Me {
    @JsonProperty("ok")
    boolean ok();

    @JsonProperty("result")
    User result();
}
