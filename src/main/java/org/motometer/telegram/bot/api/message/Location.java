package org.motometer.telegram.bot.api.message;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#location">Location</a>
 */
@Value.Immutable
public interface Location {

    @Value.Parameter
    @Gson.Named("longitude")
    double longitude();

    @Value.Parameter
    @Gson.Named("latitude")
    double latitude();
}
