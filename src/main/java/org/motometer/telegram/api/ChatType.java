package org.motometer.telegram.api;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ChatType {
    PRIVATE_CHAT("private"),
    GROUP("group"),
    SUPERGROUP("supergroup"),
    CHANNEL("channel");

    private final String value;

    ChatType(final String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
