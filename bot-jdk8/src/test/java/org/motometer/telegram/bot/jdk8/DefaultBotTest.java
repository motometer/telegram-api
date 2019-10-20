package org.motometer.telegram.bot.jdk8;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.motometer.telegram.bot.Bot;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.message.File;
import org.motometer.telegram.bot.api.message.Message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static java.nio.charset.Charset.defaultCharset;
import static org.assertj.core.api.Assertions.assertThat;

class DefaultBotTest {

    private static final String PAYLOAD_PATH = "/home/vbychkovskyi/projects/motometer/bot-api/bot-jdk8/src/test/resources/org/motometer/telegram/bot/jdk8/DefaultBotTest/update.json";

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
    @Timeout(10)
    void handleWebhook() throws ExecutionException, InterruptedException, TimeoutException, IOException {
        CompletableFuture<Update> updateListener = new CompletableFuture<>();

        bot.addUpdateListener(updateListener::complete);

        java.io.File file = Paths.get(PAYLOAD_PATH).toFile();

        String input = IOUtils.toString(new FileInputStream(file), defaultCharset());
        bot.handleWebhook(input);

        Update actual = updateListener.get(2, TimeUnit.SECONDS);

        assertThat(actual).isNotNull();
        Message message = actual.message();
        assertThat(message).isNotNull();
        assertThat(message.chat()).isNotNull();
    }
}