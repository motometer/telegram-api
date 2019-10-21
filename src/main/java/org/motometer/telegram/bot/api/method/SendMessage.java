package org.motometer.telegram.bot.api.method;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;
import org.motometer.telegram.bot.api.reply.ReplyMarkup;

/**
 * @see <a href=https://core.telegram.org/bots/api#sendmessage>SendMessage</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableSendMessage.Builder.class)
public interface SendMessage {

    @Value.Parameter
    @JsonProperty("chat_id")
    long chatId();

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
    Long replyToMessageId();

    @Nullable
    @JsonProperty("reply_markup")
    ReplyMarkup replyMarkup();
}
