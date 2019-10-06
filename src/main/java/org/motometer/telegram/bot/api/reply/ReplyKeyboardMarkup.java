package org.motometer.telegram.bot.api.reply;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface ReplyKeyboardMarkup extends ReplyMarkup {

    List<List<KeyboardButton>> keyboard();

    Boolean resizeKeyboard();

    Boolean oneTimeKeyboard();

    Boolean selective();
}
