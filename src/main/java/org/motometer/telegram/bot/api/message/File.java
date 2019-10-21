package org.motometer.telegram.bot.api.message;

import org.immutables.gson.Gson;
import org.jetbrains.annotations.Nullable;

public interface File {

    @Gson.Named("file_id")
    String fileId();

    @Nullable
    @Gson.Named("file_size")
    Long fileSize();
}
