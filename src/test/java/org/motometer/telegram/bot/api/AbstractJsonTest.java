package org.motometer.telegram.bot.api;

import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

abstract class AbstractJsonTest {

    @Getter
    private Gson gson;

    @BeforeEach
    void setUp() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(new GsonAdaptersApi());
        gson = gsonBuilder.create();
    }
}
