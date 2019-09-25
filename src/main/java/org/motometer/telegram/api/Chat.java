package org.motometer.telegram.api;

import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonProperty;

@Value.Immutable
public interface Chat {

    @JsonProperty("id")
    int getId();

    @JsonProperty("type")
    ChatType getType();
}
