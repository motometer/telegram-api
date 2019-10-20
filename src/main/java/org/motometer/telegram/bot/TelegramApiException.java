package org.motometer.telegram.bot;

/**
 * Root exception thrown by any method of {@link Bot}
 */
public class TelegramApiException extends RuntimeException {

    public TelegramApiException(Throwable cause) {
        super(cause);
    }

    public TelegramApiException(String message) {
        super(message);
    }

    public TelegramApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
