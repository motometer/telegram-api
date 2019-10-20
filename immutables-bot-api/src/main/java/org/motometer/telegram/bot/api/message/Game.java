package org.motometer.telegram.bot.api.message;

import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#game">Game</a>
 */
public interface Game {

    String title();

    String description();

    List<PhotoSize> photos();

    @Nullable
    String text();

    @Nullable
    List<MessageEntity> textEntities();

    @Nullable
    Animation animation();
}
