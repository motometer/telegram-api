package org.motometer.telegram.bot.api.message;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;
import org.motometer.telegram.bot.api.update.User;

/**
 * @see <a href="https://core.telegram.org/bots/api#messageentity">MessageEntity</a>
 */
@Value.Immutable
public interface MessageEntity {

    /**
     * Type of the entity. Can be mention (@username), hashtag, cashtag, bot_command, url, email, phone_number,
     * bold (bold text), italic (italic text), code (monowidth string), pre (monowidth block),
     * text_link (for clickable text URLs), text_mention (for users without usernames)
     */
    @Gson.Named("type")
    String type();

    @Gson.Named("offset")
    long offset();

    @Gson.Named("length")
    long length();

    @Nullable
    @Gson.Named("url")
    String url();

    @Nullable
    @Gson.Named("user")
    User user();
}
