package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href=https://core.telegram.org/bots/api#forcereply>ForceReply</a>
 */
@Value.Immutable
public interface ForceReply extends ReplyMarkup {

    @Value.Parameter
    @Gson.Named("force_reply")
    boolean forceReply();

    @Nullable
    @Value.Parameter
    @Gson.Named("selective")
    Boolean selective();
}
