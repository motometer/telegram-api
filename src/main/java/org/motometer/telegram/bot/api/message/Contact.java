package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#contact">Contact</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableContact.Builder.class)
public interface Contact {

    @JsonProperty("phone_number")
    String phoneNumber();

    @JsonProperty("first_name")
    String firstName();

    @Nullable
    @JsonProperty("last_name")
    String lastName();

    @Nullable
    @JsonProperty("user_id")
    Integer userId();

    @Nullable
    @JsonProperty("vcard")
    String vCard();
}
