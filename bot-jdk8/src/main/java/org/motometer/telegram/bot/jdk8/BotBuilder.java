package org.motometer.telegram.bot.jdk8;

import com.google.gson.Gson;
import org.motometer.telegram.bot.Bot;

import static java.util.Objects.requireNonNull;

public class BotBuilder {

    private static final String DEFAULT_HOST = "https://api.telegram.org";
    private String token;
    private String host;

    public BotBuilder() {
        host = DEFAULT_HOST;
    }

    public Bot build() {
        return new DefaultBot(new BotTemplate(baseUri(), new Gson()));
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
