package org.motometer.telegram.bot.api.reply;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

import java.util.List;

/**
 * @see <a href=https://core.telegram.org/bots/api#inlinekeyboardmarkup>InlineKeyboardMarkup</a>
 */
@Value.Immutable
public interface InlineKeyboardMarkup extends ReplyMarkup {

    @Gson.Named("inline_keyboard")
    List<List<InlineKeyboardButton>> inlineKeyboard();
}
