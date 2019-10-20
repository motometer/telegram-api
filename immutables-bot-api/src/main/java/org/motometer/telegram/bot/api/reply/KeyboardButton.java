package org.motometer.telegram.bot.api.reply;

import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#keyboardbutton">KeyboardButton</a>
 */
@Value.Immutable
public interface KeyboardButton {

    String text();

    @Nullable
    Boolean requestContact();

    @Nullable
    Boolean requestLocation();
}
