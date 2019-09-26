package org.motometer.telegram.bot.client;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.motometer.telegram.bot.api.Message;
import org.motometer.telegram.bot.api.Update;
import org.motometer.telegram.bot.api.User;

import java.util.List;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
class Method<T> {

    static final Method<User> ME = new Method<>("getMe", new TypeReference<>() {
    });
    static final Method<List<Update>> UPDATES = new Method<>("getUpdates", new TypeReference<>() {
    });
    static final Method<Message> SEND_MESSAGE = new Method<>("sendMessage", new TypeReference<>() {
    });

    private final String value;
    private final TypeReference<ApiResponse<T>> typeReference;
}
