package org.motometer.telegram.bot.api.message;

/**
 * @see <a href="https://core.telegram.org/bots/api#location">Location</a>
 */
public interface Location {

    double longitude();

    double latitude();
}
