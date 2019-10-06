package org.motometer.telegram.bot.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href=https://core.telegram.org/bots/api#user>User</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableUser.Builder.class)
public interface User {

    @JsonProperty("id")
    int id();

    @JsonProperty("first_name")
    String firstName();

    @JsonProperty("is_bot")
    boolean isBot();

    @Nullable
    @JsonProperty("last_name")
    String lastName();

    @Nullable
    @JsonProperty("username")
    String userName();

    @Nullable
    @JsonProperty("language_code")
    String languageCode();
}
