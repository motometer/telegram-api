package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;

import javax.annotation.Nullable;

public interface File {

    @Gson.Named("file_id")
    String fileId();

    @Nullable
    @Gson.Named("file_size")
    Long fileSize();
}
