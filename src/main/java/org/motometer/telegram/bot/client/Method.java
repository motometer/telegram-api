package org.motometer.telegram.bot.client;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;

import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Method<T> {

    public static final Method<User> ME = new Method<>("getMe", new TypeReference<>() {
    });
    public static final Method<List<Update>> UPDATES = new Method<>("getUpdates", new TypeReference<>() {
    });
    public static final Method<Message> SEND_MESSAGE = new Method<>("sendMessage", new TypeReference<>() {
    });

    private final String value;
    private final TypeReference<ApiResponse<T>> typeReference;

    public TypeReference<ApiResponse<T>> getTypeReference() {
        return typeReference;
    }

    public String getValue() {
        return value;
    }
}
