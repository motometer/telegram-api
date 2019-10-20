package org.motometer.telegram.bot.api.method;

import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;
import org.motometer.telegram.bot.api.reply.ReplyMarkup;

/**
 * @see <a href=https://core.telegram.org/bots/api#sendmessage>SendMessage</a>
 */
@Value.Immutable
public interface SendMessage {

    long chatId();

    String text();

    @Nullable
    String parseMode();

    @Nullable
    Boolean disableWebPagePreview();

    @Nullable
    Boolean disableNotification();

    @Nullable
    Long replyToMessageId();

    @Nullable
    ReplyMarkup replyMarkup();
}
