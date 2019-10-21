package org.motometer.telegram.bot.api;

import org.junit.jupiter.api.Test;

import static java.nio.charset.Charset.defaultCharset;
import static org.apache.commons.io.IOUtils.resourceToString;
import static org.assertj.core.api.Assertions.assertThat;

class UpdateTest extends AbstractJsonTest {

    private static final String PAYLOAD_PATH = "/org/motometer/telegram/api/UpdateTest/update.json";

    @Test
    void deserialization() throws Exception {
        final String string = resourceToString(PAYLOAD_PATH, defaultCharset());

        final Update update = gson.fromJson(string, Update.class);

        assertThat(update).isNotNull();
    }
}