package org.motometer.telegram.bot.api;

import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @see <a href="https://core.telegram.org/bots/api#chat">Chat</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableChat.Builder.class)
public interface Chat {

    @JsonProperty("id")
    int id();

    @JsonProperty("type")
    ChatType type();
}
