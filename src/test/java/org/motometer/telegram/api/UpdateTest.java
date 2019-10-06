package org.motometer.telegram.api;

import org.junit.jupiter.api.Test;
import org.motometer.telegram.bot.api.Update;

import static java.nio.charset.Charset.defaultCharset;
import static org.apache.commons.io.IOUtils.resourceToString;
import static org.assertj.core.api.Assertions.assertThat;

class UpdateTest extends AbstractJsonTest {

    private static final String PAYLOAD_PATH = "/org/motometer/telegram/api/UpdateTest/update.json";

    @Test
    void deserialization() throws Exception {
        final var string = resourceToString(PAYLOAD_PATH, defaultCharset());

        final var update = mapper.readValue(string, Update.class);

        assertThat(update).isNotNull();
    }
}