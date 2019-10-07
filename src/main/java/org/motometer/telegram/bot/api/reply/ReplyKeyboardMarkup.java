package org.motometer.telegram.bot.api.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardmarkup">ReplyKeyboardMarkup</a>
 */
@Value.Immutable
public interface ReplyKeyboardMarkup extends ReplyMarkup {

    @JsonProperty("keyboard")
    List<List<KeyboardButton>> keyboard();

    @Nullable
    @JsonProperty("resize_keyboard")
    Boolean resizeKeyboard();

    @Nullable
    @JsonProperty("one_time_keyboard")
    Boolean oneTimeKeyboard();

    @Nullable
    @JsonProperty("selective")
    Boolean selective();
}
