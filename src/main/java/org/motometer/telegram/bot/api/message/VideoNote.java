package org.motometer.telegram.bot.api.message;

import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#videonote">VideoNote</a>
 */
public interface VideoNote extends File {

    long length();

    long duration();

    @Nullable
    PhotoSize thumb();
}
