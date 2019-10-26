package org.motometer.telegram.bot.api;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ForceReplyTest extends AbstractJsonTest {

    @Test
    void forceReply() {
        ImmutableForceReply forceReply = ImmutableForceReply.of(true, null);

        String result = getGson().toJson(forceReply);

        assertThat(result).isEqualTo("{\"force_reply\":true}");
    }
}