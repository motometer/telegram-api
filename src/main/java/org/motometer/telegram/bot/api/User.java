package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href=https://core.telegram.org/bots/api#user>User</a>
 */
@Value.Immutable
public interface User {

    @Gson.Named("id")
    long id();

    @Gson.Named("first_name")
    String firstName();

    @Gson.Named("is_bot")
    boolean isBot();

    @Nullable
    @Gson.Named("last_name")
    String lastName();

    @Nullable
    @Gson.Named("username")
    String userName();

    @Nullable
    @Gson.Named("language_code")
    String languageCode();
}
