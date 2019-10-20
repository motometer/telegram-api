package org.motometer.telegram.bot.api.message;

/**
 * @see <a href="https://core.telegram.org/bots/api#maskposition">MaskPosition</a>
 */
public interface MaskPosition {

    String point();

    double xShift();

    double yShift();

    double scale();
}
