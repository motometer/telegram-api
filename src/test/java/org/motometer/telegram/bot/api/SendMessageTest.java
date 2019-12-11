package org.motometer.telegram.bot.api;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class SendMessageTest extends AbstractJsonTest {

    public static final String EXPECTED = "{\"chat_id\":102,\"text\":\"\","
        + "\"reply_markup\":{\"inline_keyboard\":[[{\"text\":\"Button 1\"}]]}}";

    @Test
    void serializeUpdateWithReply() {
        final SendMessage sendMessage = ImmutableSendMessage.builder()
            .chatId(102)
            .replyMarkup(markup())
            .text("")
            .build();

        String json = getGson().toJson(sendMessage);

        assertThat(json).isEqualTo(EXPECTED);
    }

    private ImmutableInlineKeyboardMarkup markup() {
        return ImmutableInlineKeyboardMarkup.builder()
            .addInlineKeyboard(Collections.singletonList(button()))
            .build();
    }

    private InlineKeyboardButton button() {
        return ImmutableInlineKeyboardButton.builder()
            .text("Button 1")
            .build();
    }
}