package org.motometer.telegram.bot.api.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

import java.util.List;

/**
 * @see <a href=https://core.telegram.org/bots/api#inlinekeyboardmarkup>InlineKeyboardMarkup</a>
 */
@Value.Immutable
public interface InlineKeyboardMarkup extends ReplyMarkup {

    @JsonProperty("inline_keyboard")
    List<List<InlineKeyboardButton>> inlineKeyboard();
}
