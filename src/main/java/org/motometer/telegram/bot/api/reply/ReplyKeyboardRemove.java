package org.motometer.telegram.bot.api.reply;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardremove">ReplyKeyboardRemove</a>
 */
@Value.Immutable
public interface ReplyKeyboardRemove extends ReplyMarkup {

    @Value.Parameter
    @Gson.Named("remove_keyboard")
    boolean removeKeyboard();

    @Nullable
    @Value.Parameter
    @Gson.Named("selective")
    Boolean selective();
}
