package org.motometer.telegram.bot.api.message;

import org.immutables.gson.Gson;
import org.jetbrains.annotations.Nullable;

public interface Attachment extends File {

    @Nullable
    @Gson.Named("mime_type")
    String mimeType();

    @Nullable
    PhotoSize thumb();
}
