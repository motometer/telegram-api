package org.motometer.telegram.bot.api.message;

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

    long id();

    @Nullable
    User fromUser();

    long date();

    @Nullable
    Chat chat();

    @Nullable
    User forwardFrom();

    @Nullable
    Chat forwardFromChat();

    @Nullable
    Long forwardFromMessageId();

    @Nullable
    String forwardSignature();

    @Nullable
    String forwardSenderName();

    @Nullable
    Long forwardDate();

    @Nullable
    Message replyToMessage();

    @Nullable
    Long editDate();

    @Nullable
    String mediaGroupId();

    @Nullable
    String authorSignature();

    @Nullable
    String text();

    @Nullable
    List<MessageEntity> entities();

    @Nullable
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
