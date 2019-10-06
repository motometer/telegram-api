package org.motometer.telegram.bot.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;
import org.motometer.telegram.bot.api.reply.ReplyMarkup;

@Value.Immutable
@JsonDeserialize(builder = ImmutableOutboundMessage.Builder.class)
public interface OutboundMessage {

    @Value.Parameter
    @JsonProperty("chat_id")
    int chatId();

    @Value.Parameter
    @JsonProperty("text")
    String text();

    @Nullable
    @JsonProperty("parse_mode")
    String parseMode();

    @Nullable
    @JsonProperty("disable_web_page_preview")
    Boolean disableWebPagePreview();

    @Nullable
    @JsonProperty("disable_notification")
    Boolean disableNotification();

    @Nullable
    @JsonProperty("reply_to_message_id")
    Integer replyToMessageId();

    @Nullable
    @JsonProperty("reply_markup")
    ReplyMarkup replyMarkup();
}
