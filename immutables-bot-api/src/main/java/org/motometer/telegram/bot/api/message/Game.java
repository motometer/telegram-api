package org.motometer.telegram.bot.api.message;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#game">Game</a>
 */
@Value.Immutable
public interface Game {

    String title();

    String description();

    List<PhotoSize> photos();

    @Nullable
    String text();

    @Nullable
    @Gson.Named("text_entities")
    List<MessageEntity> textEntities();

    @Nullable
    Animation animation();
}
