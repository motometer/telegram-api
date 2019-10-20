package org.motometer.telegram.bot.api;

import org.jetbrains.annotations.Contract;

public enum ChatType {
    PRIVATE_CHAT("private"),
    GROUP("group"),
    SUPERGROUP("supergroup"),
    CHANNEL("channel");

    private final String value;

    ChatType(String value) {
        this.value = value;
    }

    @Contract(pure = true)
    public String value() {
        return value;
    }
}
