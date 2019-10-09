package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;
import org.motometer.telegram.bot.api.User;

/**
 * @see <a href="https://core.telegram.org/bots/api#messageentity">MessageEntity</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableMessageEntity.Builder.class)
public interface MessageEntity {

    /**
     * Type of the entity. Can be mention (@username), hashtag, cashtag, bot_command, url, email, phone_number,
     * bold (bold text), italic (italic text), code (monowidth string), pre (monowidth block),
     * text_link (for clickable text URLs), text_mention (for users without usernames)
     */
    @JsonProperty("type")
    String type();

    @JsonProperty("offset")
    long offset();

    @JsonProperty("length")
    long length();

    @Nullable
    @JsonProperty("url")
    String url();

    @Nullable
    @JsonProperty("user")
    User user();
}
