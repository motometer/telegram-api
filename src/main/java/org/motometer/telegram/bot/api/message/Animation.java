package org.motometer.telegram.bot.api.message;

import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#animation">Animation</a>
 */
public interface Animation extends Attachment {

    long width();

    long height();

    long duration();

    @Nullable
    String fileName();
}
