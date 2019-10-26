package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

import javax.annotation.Nullable;

/**
 * @see <a href=https://core.telegram.org/bots/api#inlinekeyboardbutton>InlineKeyboardButton</a>
 */
@Value.Immutable
public interface InlineKeyboardButton {

    @Gson.Named("text")
    String text();

    @Nullable
    @Gson.Named("url")
    String url();

    @Nullable
    @Gson.Named("login_url")
    LoginUrl loginUrl();

    @Nullable
    @Gson.Named("callback_data")
    String callbackData();

    @Nullable
    @Gson.Named("switch_inline_query")
    String switchInlineQuery();

    @Nullable
    @Gson.Named("switch_inline_query_current_chat")
    String switchInlineQueryCurrentChat();

    /**
     * NOTE: This type of button must always be the first button in the first row.
     */
    @Nullable
    @Gson.Named("callback_game")
    CallbackGame callbackGame();

    /**
     * NOTE: This type of button must always be the first button in the first row.
     */
    @Nullable
    @Gson.Named("pay")
    Boolean pay();
}
