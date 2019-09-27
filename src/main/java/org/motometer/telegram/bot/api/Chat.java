package org.motometer.telegram.bot.api;

import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Value.Immutable
@JsonDeserialize(builder = ImmutableChat.Builder.class)
public interface Chat {

    @JsonProperty("id")
    int getId();

    @JsonProperty("type")
    ChatType getType();
}
