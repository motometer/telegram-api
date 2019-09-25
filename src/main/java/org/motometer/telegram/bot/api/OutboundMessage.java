package org.motometer.telegram.bot.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(builder = ImmutableOutboundMessage.Builder.class)
public interface OutboundMessage {

    @JsonProperty("chat_id")
    int chatId();

    @JsonProperty("text")
    String text();
}
