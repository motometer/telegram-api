package org.motometer.telegram.bot.api.reply;

import org.jetbrains.annotations.Nullable;

/**
 * @see <a href=https://core.telegram.org/bots/api#forcereply>ForceReply</a>
 */
public interface ForceReply extends ReplyMarkup {

    boolean forceReply();

    @Nullable
    Boolean selective();
}
