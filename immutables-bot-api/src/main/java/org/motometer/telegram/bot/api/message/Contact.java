package org.motometer.telegram.bot.api.message;

import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#contact">Contact</a>
 */
public interface Contact {

    String phoneNumber();

    String firstName();

    @Nullable
    String lastName();

    @Nullable
    Long userId();

    @Nullable
    String vCard();
}
