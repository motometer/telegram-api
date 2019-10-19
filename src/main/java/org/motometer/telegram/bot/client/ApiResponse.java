package org.motometer.telegram.bot.client;

import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
class ApiResponse<T> {

    private boolean ok;

    @Nullable
    private String description;

    @Nullable
    @JsonProperty("error_code")
    private Long errorCode;

    @Nullable
    private T result;
}
