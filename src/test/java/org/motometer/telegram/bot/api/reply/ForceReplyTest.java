package org.motometer.telegram.bot.api.reply;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.motometer.telegram.api.AbstractJsonTest;

import static org.assertj.core.api.Assertions.assertThat;

class ForceReplyTest extends AbstractJsonTest {

    @Test
    void forceReply() throws JsonProcessingException {
        var forceReply = ImmutableForceReply.of(true, null);

        var result = mapper.writeValueAsString(forceReply);

        assertThat(result).isEqualTo("{\"force_reply\":true}");
    }
}