package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.Nullable;

public interface File {

    @JsonProperty("file_id")
    String fileId();

    @Nullable
    @JsonProperty("file_size")
    Long fileSize();
}
