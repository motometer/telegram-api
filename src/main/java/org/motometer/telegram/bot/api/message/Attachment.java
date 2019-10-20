package org.motometer.telegram.bot.api.message;

import org.jetbrains.annotations.Nullable;

public interface Attachment extends File {

    @Nullable
    String mimeType();

    @Nullable
    PhotoSize thumb();
}
