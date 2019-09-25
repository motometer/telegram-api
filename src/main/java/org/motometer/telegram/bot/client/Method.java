package org.motometer.telegram.bot.client;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.motometer.telegram.bot.api.ApiResponse;
import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;

import java.util.List;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Method<T> {

    public static final Method<ApiResponse<User>> ME = new Method<>("getMe", new TypeReference<>() {
    });
    public static final Method<ApiResponse<List<Update>>> UPDATES = new Method<>("getUpdates", new TypeReference<>() {
    });
    public static final Method<ApiResponse<Message>> SEND_MESSAGE = new Method<>("sendMessage", new TypeReference<>() {
    });

    private final String value;
    private final TypeReference<T> typeReference;
}
