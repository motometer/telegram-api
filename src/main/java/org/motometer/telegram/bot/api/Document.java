package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

import javax.annotation.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#document">Document</a>
 */
@Value.Immutable
public interface Document extends Attachment {

    @Nullable
    @Gson.Named("file_name")
    String fileName();
}
