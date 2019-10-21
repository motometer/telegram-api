package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.jetbrains.annotations.Nullable;

public interface File {

    @Gson.Named("file_id")
    String fileId();

    @Nullable
    @Gson.Named("file_size")
    Long fileSize();
}
