package org.motometer.telegram.bot.api.message;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

/**
 * @see <a href="https://core.telegram.org/bots/api#video">Video</a>
 */
@Value.Immutable
public interface Video extends Attachment {

    @Gson.Named("width")
    long width();

    @Gson.Named("height")
    long height();

    @Gson.Named("duration")
    long duration();
}
