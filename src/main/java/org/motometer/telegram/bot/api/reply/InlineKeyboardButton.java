package org.motometer.telegram.bot.api.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href=https://core.telegram.org/bots/api#inlinekeyboardbutton>InlineKeyboardButton</a>
 */
@Value.Immutable
public interface InlineKeyboardButton {

    @JsonProperty("text")
    String text();

    @Nullable
    @JsonProperty("url")
    String url();

    @Nullable
    @JsonProperty("login_url")
    LoginUrl loginUrl();

    @Nullable
    @JsonProperty("callback_data")
    String callbackData();

    @Nullable
    @JsonProperty("switch_inline_query")
    String switchInlineQuery();

    @Nullable
    @JsonProperty("switch_inline_query_current_chat")
    String switchInlineQueryCurrentChat();

    /**
     * NOTE: This type of button must always be the first button in the first row.
     */
    @Nullable
    @JsonProperty("callback_game")
    CallbackGame callbackGame();

    /**
     * NOTE: This type of button must always be the first button in the first row.
     */
    @Nullable
    @JsonProperty("pay")
    Boolean pay();
}
