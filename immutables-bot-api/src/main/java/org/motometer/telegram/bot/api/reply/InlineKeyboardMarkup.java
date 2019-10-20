package org.motometer.telegram.bot.api.reply;

import org.immutables.value.Value;

import java.util.List;

/**
 * @see <a href=https://core.telegram.org/bots/api#inlinekeyboardmarkup>InlineKeyboardMarkup</a>
 */
@Value.Immutable
public interface InlineKeyboardMarkup extends ReplyMarkup {

    List<List<InlineKeyboardButton>> inlineKeyboard();
}
