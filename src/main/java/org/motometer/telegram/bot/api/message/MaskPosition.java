package org.motometer.telegram.bot.api.message;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#maskposition">MaskPosition</a>
 */
@Value.Immutable
public interface MaskPosition {

    @Gson.Named("point")
    String point();

    @Gson.Named("x_shift")
    double xShift();

    @Gson.Named("y_shift")
    double yShift();

    @Gson.Named("scale")
    double scale();
}
