package org.motometer.telegram.bot.api.reply;

import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#loginurl">LoginUrl</a>
 */
@Value.Immutable
public interface LoginUrl {

    String url();

    @Nullable
    String forwardText();

    @Nullable
    String botUsername();

    @Nullable
    Boolean requestWriteAccess();
}
