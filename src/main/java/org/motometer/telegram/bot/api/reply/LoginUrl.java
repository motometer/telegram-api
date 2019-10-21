package org.motometer.telegram.bot.api.reply;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#loginurl">LoginUrl</a>
 */
@Value.Immutable
public interface LoginUrl {

    @Gson.Named("url")
    String url();

    @Nullable
    @Gson.Named("forward_text")
    String forwardText();

    @Nullable
    @Gson.Named("bot_username")
    String botUsername();

    @Nullable
    @Gson.Named("request_write_access")
    Boolean requestWriteAccess();
}
