package org.motometer.telegram.bot.jdk8;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.motometer.telegram.bot.Bot;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.message.Message;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import static java.nio.charset.Charset.defaultCharset;
import static org.assertj.core.api.Assertions.assertThat;

class DefaultBotTest {

    private static final String PAYLOAD_PATH = "https://raw.githubusercontent.com/motometer/telegram-bot-api/9ec9bc2da04331546ca3c832a268279411a4129f/bot-jdk8/src/test/resources/org/motometer/telegram/bot/jdk8/DefaultBotTest/update.json";

    private Bot bot;

    @BeforeEach
    void setUp() {
        bot = new BotBuilder()
            .token("token")
            .build();
    }

    @Test
    void updates() {
        List<Update> updates = bot.updates();

        assertThat(updates).isNotEmpty();
    }

    @Test
    void handleWebhook() throws IOException {
        String input = IOUtils.toString(new URL(PAYLOAD_PATH), defaultCharset());

        Update actual = bot.parseUpdate(input);

        assertThat(actual).isNotNull();
        Message message = actual.message();
        assertThat(message).isNotNull();
        assertThat(message.chat()).isNotNull();
    }
}