package org.motometer.telegram.bot.api.message;

import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.motometer.telegram.bot.api.Chat;
import org.motometer.telegram.bot.api.User;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#message">Message</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableMessage.Builder.class)
public interface Message {

    @JsonProperty("message_id")
    int id();

    @Nullable
    @JsonProperty("from")
    User fromUser();

    @JsonProperty("date")
    int date();

    @Nullable
    @JsonProperty("chat")
    Chat chat();

    @Nullable
    @JsonProperty("forward_from")
    User forwardFrom();

    @Nullable
    @JsonProperty("forward_from_chat")
    Chat forwardFromChat();

    @Nullable
    @JsonProperty("forward_from_message_id")
    Integer forwardFromMessageId();

    @Nullable
    @JsonProperty("forward_signature")
    String forwardSignature();

    @Nullable
    @JsonProperty("forward_sender_name")
    String forwardSenderName();

    @Nullable
    @JsonProperty("forward_date")
    Integer forwardDate();

    @Nullable
    @JsonProperty("reply_to_message")
    Message replyToMessage();

    @Nullable
    @JsonProperty("edit_date")
    Integer editDate();

    @Nullable
    @JsonProperty("media_group_id")
    String mediaGroupId();

    @Nullable
    @JsonProperty("author_signature")
    String authorSignature();

    @Nullable
    @JsonProperty("text")
    String text();

    @Nullable
    @JsonProperty("entities")
    List<MessageEntity> entities();

    @Nullable
    @JsonProperty("caption_entities")
    List<MessageEntity> captionEntities();

    @Nullable
    @JsonProperty("audio")
    Audio audio();

    @Nullable
    @JsonProperty("document")
    Document document();

    @Nullable
    @JsonProperty("animation")
    Animation animation();

    @Nullable
    @JsonProperty("game")
    Game game();

    @Nullable
    @JsonProperty("photo")
    List<PhotoSize> photo();

    @Nullable
    @JsonProperty("sticker")
    Sticker sticker();

    @Nullable
    @JsonProperty("video")
    Video video();

    @Nullable
    @JsonProperty("voice")
    Voice voice();

    @Nullable
    @JsonProperty("video_note")
    VideoNote videoNote();

    @Nullable
    @JsonProperty("caption")
    String caption();

    @Nullable
    @JsonProperty("contact")
    Contact contact();

    @Nullable
    @JsonProperty("location")
    Location location();
}
