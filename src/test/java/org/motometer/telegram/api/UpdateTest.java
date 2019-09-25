package org.motometer.telegram.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

class UpdateTest {

    @Test
    void deserialization() throws Exception {
        final ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        final String string = IOUtils.resourceToString("/org/motometer/telegram/api/UpdateTest/update.json", Charset.defaultCharset());

        final org.motometer.telegram.bot.api.Update update = mapper.readValue(string, org.motometer.telegram.bot.api.Update.class);

        assertThat(update).isNotNull();
    }
}