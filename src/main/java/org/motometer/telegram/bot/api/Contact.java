package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#contact">Contact</a>
 */
@Value.Immutable
public interface Contact {

    @Gson.Named("phone_number")
    String phoneNumber();

    @Gson.Named("first_name")
    String firstName();

    @Nullable
    @Gson.Named("last_name")
    String lastName();

    @Nullable
    @Gson.Named("user_id")
    Long userId();

    @Nullable
    @Gson.Named("vcard")
    String vCard();
}
