package org.motometer.telegram.bot.api;

import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href=https://core.telegram.org/bots/api#user>User</a>
 */
@Value.Immutable
public interface User {

    long id();

    String firstName();

    boolean isBot();

    @Nullable
    String lastName();

    @Nullable
    String userName();

    @Nullable
    String languageCode();
}
