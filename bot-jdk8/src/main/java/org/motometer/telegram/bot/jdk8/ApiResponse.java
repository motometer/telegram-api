package org.motometer.telegram.bot.jdk8;


import org.immutables.gson.Gson;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

@Value.Immutable
@Gson.TypeAdapters
public interface ApiResponse<T> {

    @Gson.Named("ok")
    boolean isOk();

    T result();

    @Nullable
    String description();
}
