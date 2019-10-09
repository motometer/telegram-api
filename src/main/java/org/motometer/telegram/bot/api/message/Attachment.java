package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.Nullable;

public interface Attachment {

    @JsonProperty("file_id")
    String fileId();

    @Nullable
    @JsonProperty("mime_type")
    String mimeType();

    @Nullable
    @JsonProperty("file_size")
    Integer fileSize();

    @Nullable
    @JsonProperty("thumb")
    PhotoSize thumb();
}
