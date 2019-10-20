package org.motometer.telegram.bot.jdk8;

import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import org.motometer.telegram.bot.Bot;

import java.util.ServiceLoader;

import static java.util.Objects.requireNonNull;

public class BotBuilder {

    private static final String DEFAULT_HOST = "https://api.telegram.org";
    private String token;
    private String host;

    public BotBuilder() {
        host = DEFAULT_HOST;
    }

    public Bot build() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        for (TypeAdapterFactory factory : ServiceLoader.load(TypeAdapterFactory.class)) {
            gsonBuilder.registerTypeAdapterFactory(factory);
        }

        return new DefaultBot(new BotTemplate(baseUri(), gsonBuilder.create()));
    }

    private String baseUri() {
        return host + "/bot" + requireNonNull(token) + "/";
    }

    public BotBuilder token(String token) {
        this.token = token;
        return this;
    }

    public BotBuilder apiHost(String host) {
        this.host = host;
        return this;
    }
}
