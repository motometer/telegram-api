package org.motometer.telegram.bot.jdk8;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import lombok.SneakyThrows;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.util.ssl.SslContextFactory;
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

    @SneakyThrows
    public Bot build() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        for (TypeAdapterFactory factory : ServiceLoader.load(TypeAdapterFactory.class)) {
            gsonBuilder.registerTypeAdapterFactory(factory);
        }

        HttpClient httpClient = new HttpClient(new SslContextFactory.Client());


        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                httpClient.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        httpClient.start();

        Gson gson = gsonBuilder.create();
        return new DefaultBot(new BotTemplate(httpClient, baseUri(), gson), gson);
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
