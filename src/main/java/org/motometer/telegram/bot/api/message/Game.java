package org.motometer.telegram.bot.api.message;

import java.util.List;

import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#game">Game</a>
 */
@Value.Immutable
public interface Game {

    @Gson.Named("title")
    String title();

    @Gson.Named("description")
    String description();

    @Gson.Named("photo")
    List<PhotoSize> photos();

    @Nullable
    @Gson.Named("text")
    String text();

    @Nullable
    @Gson.Named("text_entities")
    List<MessageEntity> textEntities();

    @Nullable
    @Gson.Named("animation")
    Animation animation();
}
