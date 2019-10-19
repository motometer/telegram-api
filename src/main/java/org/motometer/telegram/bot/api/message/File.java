package org.motometer.telegram.bot.api.message;

import org.jetbrains.annotations.Nullable;

public interface File {

    String fileId();

    @Nullable
    Long fileSize();
}
