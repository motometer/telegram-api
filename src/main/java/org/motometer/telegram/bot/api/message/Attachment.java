package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.Nullable;

public interface Attachment extends File {

    @Nullable
    @JsonProperty("mime_type")
    String mimeType();

    @Nullable
    @JsonProperty("thumb")
    PhotoSize thumb();
}
