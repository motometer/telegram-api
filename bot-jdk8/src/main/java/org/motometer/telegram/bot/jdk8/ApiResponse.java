package org.motometer.telegram.bot.jdk8;


import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Value.Immutable
@Gson.TypeAdapters
public interface ApiResponse<T> {
    boolean isOk();

    T result();

    String description();
}
