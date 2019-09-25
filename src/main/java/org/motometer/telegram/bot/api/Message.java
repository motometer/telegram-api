package org.motometer.telegram.bot.api;

import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Value.Immutable
@JsonDeserialize(builder = ImmutableMessage.Builder.class)
public interface Message {

    @JsonProperty("message_id")
    int getId();

    @Nullable
    @JsonProperty("from")
    User getFromUser();

    @JsonProperty("date")
    int getDate();

    @Nullable
    @JsonProperty("chat")
    Chat getChat();

    @Nullable
    @JsonProperty("text")
    String getText();
}
