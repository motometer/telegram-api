package org.motometer.telegram.bot.api.reply;

import java.util.List;

/**
 * @see <a href=https://core.telegram.org/bots/api#inlinekeyboardmarkup>InlineKeyboardMarkup</a>
 */
public interface InlineKeyboardMarkup extends ReplyMarkup {

    List<List<InlineKeyboardButton>> inlineKeyboard();
}
