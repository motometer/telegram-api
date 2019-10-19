package org.motometer.telegram.bot.api.message;

/**
 * @see <a href="https://core.telegram.org/bots/api#video">Video</a>
 */
public interface Video extends Attachment {

    long width();

    long height();

    long duration();
}
