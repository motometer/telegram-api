package org.motometer.telegram.bot.api;

import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Value.Immutable
@JsonDeserialize(builder = ImmutableMessage.Builder.class)
public interface Message {

    @JsonProperty("message_id")
    int id();

    @Nullable
    @JsonProperty("from")
    User fromUser();

    @JsonProperty("date")
    int date();

    @Nullable
    @JsonProperty("chat")
    Chat chat();

    @Nullable
    @JsonProperty("text")
    String text();
}
