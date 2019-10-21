package org.motometer.telegram.bot.api.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#loginurl">LoginUrl</a>
 */
@Value.Immutable
public interface LoginUrl {

    @JsonProperty("url")
    String url();

    @Nullable
    @JsonProperty("forward_text")
    String forwardText();

    @Nullable
    @JsonProperty("bot_username")
    String botUsername();

    @Nullable
    @JsonProperty("request_write_access")
    Boolean requestWriteAccess();
}
