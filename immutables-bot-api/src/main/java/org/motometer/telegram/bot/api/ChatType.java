package org.motometer.telegram.bot.api;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Contract;

public enum ChatType {
    @SerializedName("private")
    PRIVATE_CHAT("private"),
    @SerializedName("group")
    GROUP("group"),
    @SerializedName("supergroup")
    SUPERGROUP("supergroup"),
    @SerializedName("channel")
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
