package org.motometer.telegram.bot.api.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @see <a href="https://core.telegram.org/bots/api#game">Game</a>
 */
@Value.Immutable
@JsonDeserialize(builder = ImmutableGame.Builder.class)
public interface Game {

    @JsonProperty("title")
    String title();

    @JsonProperty("description")
    String description();

    @JsonProperty("photo")
    List<PhotoSize> photos();

    @Nullable
    @JsonProperty("text")
    String text();

    @Nullable
    @JsonProperty("text_entities")
    List<MessageEntity> textEntities();

    @Nullable
    @JsonProperty("animation")
    Animation animation();
}
