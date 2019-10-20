package org.motometer.telegram.bot.api.message;

import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#document">Document</a>
 */
public interface Document extends Attachment {

    @Nullable
    String fileName();
}
