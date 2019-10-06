package org.motometer.telegram.bot.api.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href=https://core.telegram.org/bots/api#forcereply>ForceReply</a>
 */
@Value.Immutable
public interface ForceReply extends ReplyMarkup {

    @Value.Parameter
    @JsonProperty("force_reply")
    boolean forceReply();

    @Nullable
    @Value.Parameter
    @JsonProperty("selective")
    Boolean selective();
}
