package org.motometer.telegram.bot.api;

import com.google.gson.annotations.SerializedName;

public enum ChatType {
    @SerializedName("private") PRIVATE_CHAT,
    @SerializedName("group") GROUP,
    @SerializedName("supergroup") SUPER_GROUP,
    @SerializedName("channel") CHANNEL
}
