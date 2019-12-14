package org.motometer.telegram.bot;

/**
 * Callback action to be performed once {@link org.motometer.telegram.bot.api.Update} received.
 * Implementations might call bot methods if it is required by business flow or do nothing if no action required.
 */
@FunctionalInterface
public interface Action {

    /**
     *
     * @param bot the bot on which bot methods would be called
     */
    void doAction(Bot bot);

    /**
     * No operation action
     * @return empty function
     */
    static Action empty() {
        return bot -> {
        };
    }
}
