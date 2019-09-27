package org.motometer.telegram.bot.api;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ChatType {
    PRIVATE_CHAT("private"),
    GROUP("group"),
    SUPERGROUP("supergroup"),
    CHANNEL("channel");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }
}
