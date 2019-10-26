package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

import javax.annotation.Nullable;

/**
 * @see <a href=https://core.telegram.org/bots/api#sendmessage>SendMessage</a>
 */
@Value.Immutable
public interface SendMessage {

    @Value.Parameter
    @Gson.Named("chat_id")
    long chatId();

    @Value.Parameter
    @Gson.Named("text")
    String text();

    @Nullable
    @Gson.Named("parse_mode")
    String parseMode();

    @Nullable
    @Gson.Named("disable_web_page_preview")
    Boolean disableWebPagePreview();

    @Nullable
    @Gson.Named("disable_notification")
    Boolean disableNotification();

    @Nullable
    @Gson.Named("reply_to_message_id")
    Long replyToMessageId();

    @Nullable
    @Gson.Named("reply_markup")
    ReplyMarkup replyMarkup();
}
