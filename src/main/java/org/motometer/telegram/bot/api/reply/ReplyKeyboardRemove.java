package org.motometer.telegram.bot.api.reply;

import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#replykeyboardremove">ReplyKeyboardRemove</a>
 */
public interface ReplyKeyboardRemove extends ReplyMarkup {

    boolean removeKeyboard();

    @Nullable
    Boolean selective();
}
