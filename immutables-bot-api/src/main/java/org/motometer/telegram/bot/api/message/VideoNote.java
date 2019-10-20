package org.motometer.telegram.bot.api.message;

import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#videonote">VideoNote</a>
 */
@Value.Immutable
public interface VideoNote extends File {

    long length();

    long duration();

    @Nullable
    PhotoSize thumb();
}
