package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

import javax.annotation.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#callbackquery">CallbackQuery</a>
 */
@Value.Immutable
@Value.Style(from = "fromValue")
public interface CallbackQuery {

    @Gson.Named("id")
    String id();

    @Gson.Named("from")
    User from();

    @Gson.Named("message")
    Message message();

    @Nullable
    @Gson.Named("inline_message_id")
    String inlineMessageId();

    @Gson.Named("chat_instance")
    String chatInstance();

    @Nullable
    @Gson.Named("data")
    String data();

    @Nullable
    @Gson.Named("game_short_name")
    String gameShortName();
}
