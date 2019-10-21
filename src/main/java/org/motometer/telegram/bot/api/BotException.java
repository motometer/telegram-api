package org.motometer.telegram.bot.api;

/**
 * Base exception thrown by any method of {@link Bot}
 */
public class BotException extends RuntimeException {

    public BotException(Throwable e) {
        super(e);
    }

    public BotException(String message) {
        super(message);
    }

    public BotException(String message, Throwable cause) {
        super(message, cause);
    }
}
