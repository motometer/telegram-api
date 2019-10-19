package org.motometer.telegram.bot.api.reply;

import org.jetbrains.annotations.Nullable;

/**
 * @see <a href=https://core.telegram.org/bots/api#inlinekeyboardbutton>InlineKeyboardButton</a>
 */
public interface InlineKeyboardButton {

    String text();

    @Nullable
    String url();

    @Nullable
    LoginUrl loginUrl();

    @Nullable
    String callbackData();

    @Nullable
    String switchInlineQuery();

    @Nullable
    String switchInlineQueryCurrentChat();

    /**
     * NOTE: This type of button must always be the first button in the first row.
     */
    @Nullable
    CallbackGame callbackGame();

    /**
     * NOTE: This type of button must always be the first button in the first row.
     */
    @Nullable
    Boolean pay();
}
