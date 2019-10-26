package org.motometer.telegram.bot;

/**
 * Base exception thrown by any method of {@link Bot}
 */
public class BotException extends RuntimeException {

    static final long serialVersionUID = 89742312190703439L;

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
