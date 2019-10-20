package org.motometer.telegram.bot.api.reply;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#keyboardbutton">KeyboardButton</a>
 */
@Value.Immutable
public interface KeyboardButton {

    String text();

    @Nullable
    @Gson.Named("request_contact")
    Boolean requestContact();

    @Nullable
    @Gson.Named("request_location")
    Boolean requestLocation();
}
