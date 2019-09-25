package org.motometer.telegram.bot.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(builder = ImmutableApiResponse.Builder.class)
public interface ApiResponse<T> {

    @JsonProperty("ok")
    boolean ok();

    @JsonProperty("result")
    T result();
}
