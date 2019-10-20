package org.motometer.telegram.bot.api.reply;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardmarkup">ReplyKeyboardMarkup</a>
 */
@Value.Immutable
public interface ReplyKeyboardMarkup extends ReplyMarkup {

    List<List<KeyboardButton>> keyboard();

    @Nullable
    @Gson.Named("resize_keyboard")
    Boolean resizeKeyboard();

    @Nullable
    @Gson.Named("one_time_keyboard")
    Boolean oneTimeKeyboard();

    @Nullable
    Boolean selective();
}
