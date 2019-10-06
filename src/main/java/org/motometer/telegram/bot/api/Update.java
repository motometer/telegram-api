package org.motometer.telegram.bot.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#update">Update</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableUpdate.Builder.class)
public interface Update {

    @JsonProperty("update_id")
    int id();

    @Nullable
    @JsonProperty("message")
    Message message();

    @Nullable
    @JsonProperty("edited_message")
    Message editedMessage();

    @Nullable
    @JsonProperty("channel_post")
    Message channelPost();

    @Nullable
    @JsonProperty("edited_channel_post")
    Message editedChannelPost();
}
