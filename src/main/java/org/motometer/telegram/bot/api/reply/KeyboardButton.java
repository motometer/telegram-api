package org.motometer.telegram.bot.api.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#keyboardbutton">KeyboardButton</a>
 */
@Value.Immutable
public interface KeyboardButton {

    @Value.Parameter
    @JsonProperty("text")
    String text();

    @Nullable
    @Value.Parameter
    @JsonProperty("request_contact")
    Boolean requestContact();

    @Nullable
    @Value.Parameter
    @JsonProperty("request_location")
    Boolean requestLocation();
}
