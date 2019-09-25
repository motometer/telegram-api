package org.motometer.telegram.api;

import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Value.Immutable
public interface Update {

    @JsonProperty("update_id")
    int getId();

    @Nullable
    @JsonProperty("message")
    Message getMessage();

    @Nullable
    @JsonProperty("edited_message")
    Message getEditedMessage();

    @Nullable
    @JsonProperty("channel_post")
    Message getChannelPost();

    @Nullable
    @JsonProperty("edited_channel_post")
    Message getEditedChannelPost();
}
