package org.motometer.telegram.bot.api.reply;

import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#loginurl">LoginUrl</a>
 */
public interface LoginUrl {

    String url();

    @Nullable
    String forwardText();

    @Nullable
    String botUsername();

    @Nullable
    Boolean requestWriteAccess();
}
