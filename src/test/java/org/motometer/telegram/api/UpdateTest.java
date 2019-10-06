package org.motometer.telegram.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

class UpdateTest extends AbstractJsonTest {

    @Test
    void deserialization() throws Exception {
        final var string = IOUtils.resourceToString("/org/motometer/telegram/api/UpdateTest/update.json", Charset.defaultCharset());

        final var update = mapper.readValue(string, org.motometer.telegram.bot.api.Update.class);

        assertThat(update).isNotNull();
    }
}