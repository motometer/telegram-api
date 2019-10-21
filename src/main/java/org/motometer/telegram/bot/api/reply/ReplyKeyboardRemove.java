package org.motometer.telegram.bot.api.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardremove">ReplyKeyboardRemove</a>
 */
@Value.Immutable
public interface ReplyKeyboardRemove extends ReplyMarkup {

    @Value.Parameter
    @JsonProperty("remove_keyboard")
    boolean removeKeyboard();

    @Nullable
    @Value.Parameter
    @JsonProperty("selective")
    Boolean selective();
}
