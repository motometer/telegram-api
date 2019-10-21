package org.motometer.telegram.bot.api;

import java.util.List;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardmarkup">ReplyKeyboardMarkup</a>
 */
@Value.Immutable
public interface ReplyKeyboardMarkup extends ReplyMarkup {

    @Gson.Named("keyboard")
    List<List<KeyboardButton>> keyboard();

    @Nullable
    @Gson.Named("resize_keyboard")
    Boolean resizeKeyboard();

    @Nullable
    @Gson.Named("one_time_keyboard")
    Boolean oneTimeKeyboard();

    @Nullable
    @Gson.Named("selective")
    Boolean selective();
}
