package org.motometer.telegram.bot.api.message;

import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#video">Video</a>
 */
@Value.Immutable
public interface Video extends Attachment {

    long width();

    long height();

    long duration();
}
