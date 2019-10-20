package org.motometer.telegram.bot.api.message;

import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#location">Location</a>
 */
@Value.Immutable
public interface Location {

    double longitude();

    double latitude();
}
