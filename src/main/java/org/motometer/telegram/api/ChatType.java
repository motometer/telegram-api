package org.motometer.telegram.api;

public enum ChatType {
    PRIVATE_CHAT("private"),
    GROUP("group"),
    SUPERGROUP("supergroup"),
    CHANNEL("channel");

    private final String value;

    ChatType(final String value) {
        this.value = value;
    }
}
