package org.motometer.telegram.bot.api;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

import javax.annotation.Nullable;

/**
 * @see <a href="https://core.telegram.org/bots/api#answercallbackquery">CallbackQueryAnswer</a>
 */
@Value.Immutable
public interface CallbackQueryAnswer {

    @Gson.Named("callback_query_id")
    String callbackQueryId();

    @Nullable
    @Gson.Named("text")
    String text();

    @Nullable
    @Gson.Named("show_alert")
    Boolean showAlert();

    @Nullable
    @Gson.Named("url")
    String url();

    /**
     * The maximum amount of time in seconds that the result of the callback query may be cached client-side.
     * Telegram apps will support caching starting in version 3.14. Defaults to 0.
     *
     * @return cache time in seconds
     */
    @Nullable
    @Gson.Named("cache_time")
    Long cacheTime();
}
