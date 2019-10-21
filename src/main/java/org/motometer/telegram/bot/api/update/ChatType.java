package org.motometer.telegram.bot.api.update;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ChatType {
    PRIVATE_CHAT("private"),
    GROUP("group"),
    SUPERGROUP("supergroup"),
    CHANNEL("channel");

    private final String value;

    public String getValue() {
        return value;
    }
}
