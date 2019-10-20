package org.motometer.telegram.bot.api.reply;

import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#keyboardbutton">KeyboardButton</a>
 */
public interface KeyboardButton {

    String text();

    @Nullable
    Boolean requestContact();

    @Nullable
    Boolean requestLocation();
}
