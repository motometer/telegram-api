package org.motometer.telegram.bot.api.message;

import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#voice">Voice</a>
 */
public interface Voice extends File {

    long duration();

    @Nullable
    String mimeType();
}
