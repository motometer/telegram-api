package org.motometer.telegram.bot.api;

import java.util.List;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

/**
 * @see <a href=https://core.telegram.org/bots/api#inlinekeyboardmarkup>InlineKeyboardMarkup</a>
 */
@Value.Immutable
public interface InlineKeyboardMarkup extends ReplyMarkup {

    @Gson.Named("inline_keyboard")
    List<List<InlineKeyboardButton>> inlineKeyboard();
}
