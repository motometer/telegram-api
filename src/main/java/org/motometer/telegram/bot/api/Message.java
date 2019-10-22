package org.motometer.telegram.bot.api;

import java.util.List;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#message">Message</a>
 */
@Value.Immutable
public interface Message {

    @Gson.Named("message_id")
    long id();

    @Nullable
    @Gson.Named("from")
    User fromUser();

    @Gson.Named("date")
    long date();

    @Nullable
    @Gson.Named("chat")
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
    @Gson.Named("text")
    String text();

    @Nullable
    @Gson.Named("entities")
    List<MessageEntity> entities();

    @Nullable
    @Gson.Named("caption_entities")
    List<MessageEntity> captionEntities();

    @Nullable
    @Gson.Named("audio")
    Audio audio();

    @Nullable
    @Gson.Named("document")
    Document document();

    @Nullable
    @Gson.Named("animation")
    Animation animation();

    @Nullable
    @Gson.Named("game")
    Game game();

    @Nullable
    @Gson.Named("photo")
    List<PhotoSize> photo();

    @Nullable
    @Gson.Named("sticker")
    Sticker sticker();

    @Nullable
    @Gson.Named("video")
    Video video();

    @Nullable
    @Gson.Named("voice")
    Voice voice();

    @Nullable
    @Gson.Named("video_note")
    VideoNote videoNote();

    @Nullable
    @Gson.Named("caption")
    String caption();

    @Nullable
    @Gson.Named("contact")
    Contact contact();

    @Nullable
    @Gson.Named("location")
    Location location();
}
