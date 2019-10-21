package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#document">Document</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableDocument.Builder.class)
public interface Document extends Attachment {

    @Nullable
    @JsonProperty("file_name")
    String fileName();
}
