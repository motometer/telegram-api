package org.motometer.telegram.bot.api.message;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;
import org.motometer.telegram.bot.api.Chat;
import org.motometer.telegram.bot.api.User;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#message">Message</a>
 */
@Value.Immutable
public interface Message {

    @Gson.Named("message_id")
    long id();

    @Nullable
    @Gson.Named("from_user")
    User fromUser();

    long date();

    @Nullable
    Chat chat();

    @Nullable
    @Gson.Named("forward_from")
    User forwardFrom();

    @Nullable
    @Gson.Named("forward_from_chat")
    Chat forwardFromChat();

    @Nullable
    @Gson.Named("forward_from_message_id")
    Long forwardFromMessageId();

    @Nullable
    @Gson.Named("forward_signature")
    String forwardSignature();

    @Nullable
    @Gson.Named("forward_sender_name")
    String forwardSenderName();

    @Nullable
    @Gson.Named("forward_date")
    Long forwardDate();

    @Nullable
    @Gson.Named("reply_to_message")
    Message replyToMessage();

    @Nullable
    @Gson.Named("edit_date")
    Long editDate();

    @Nullable
    @Gson.Named("media_group_id")
    String mediaGroupId();

    @Nullable
    @Gson.Named("author_signature")
    String authorSignature();

    @Nullable
    String text();

    @Nullable
    List<MessageEntity> entities();

    @Nullable
    @Gson.Named("caption_entities")
    List<MessageEntity> captionEntities();

    @Nullable
    Audio audio();

    @Nullable
    Document document();

    @Nullable
    Animation animation();

    @Nullable
    Game game();

    @Nullable
    List<PhotoSize> photo();

    @Nullable
    Sticker sticker();

    @Nullable
    Video video();

    @Nullable
    Voice voice();

    @Nullable
    VideoNote videoNote();

    @Nullable
    String caption();

    @Nullable
    Contact contact();

    @Nullable
    Location location();
}
