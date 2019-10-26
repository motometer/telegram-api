package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;

import javax.annotation.Nullable;

public interface Attachment extends File {

    @Nullable
    @Gson.Named("mime_type")
    String mimeType();

    @Nullable
    @Gson.Named("thumb")
    PhotoSize thumb();
}
