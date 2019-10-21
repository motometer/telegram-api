package org.motometer.telegram.bot.api.reply;

import org.junit.jupiter.api.Test;
import org.motometer.telegram.bot.api.update.AbstractJsonTest;

import static org.assertj.core.api.Assertions.assertThat;

class ForceReplyTest extends AbstractJsonTest {

    @Test
    void forceReply() {
        ImmutableForceReply forceReply = ImmutableForceReply.of(true, null);

        String result = gson.toJson(forceReply);

        assertThat(result).isEqualTo("{\"force_reply\":true}");
    }
}