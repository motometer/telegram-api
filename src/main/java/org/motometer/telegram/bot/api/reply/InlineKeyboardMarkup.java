package org.motometer.telegram.bot.api.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface InlineKeyboardMarkup extends ReplyMarkup {

    @JsonProperty("inline_keyboard")
    List<List<InlineKeyboardButton>> inlineKeyboard();
}
