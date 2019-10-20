package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;
import org.motometer.telegram.bot.api.message.Message;

/**
 * @see <a href="https://core.telegram.org/bots/api#update">Update</a>
 */
@Value.Immutable
public interface Update {

    @Gson.Named("update_id")
    long id();

    @Nullable
    Message message();

    @Nullable
    @Gson.Named("edited_message")
    Message editedMessage();

    @Nullable
    @Gson.Named("channel_post")
    Message channelPost();

    @Nullable
    @Gson.Named("edited_channel_post")
    Message editedChannelPost();
}
