package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href=https://core.telegram.org/bots/api#user>User</a>
 */
@Value.Immutable
public interface User {

    long id();

    @Gson.Named("is_bot")
    boolean isBot();

    @Gson.Named("first_name")
    String firstName();

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
