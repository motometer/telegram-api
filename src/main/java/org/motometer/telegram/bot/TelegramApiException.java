package org.motometer.telegram.bot;

public class TelegramApiException extends RuntimeException {

    public TelegramApiException(Throwable e) {
        super(e);
    }

    public TelegramApiException(String message) {
        super(message);
    }
}
