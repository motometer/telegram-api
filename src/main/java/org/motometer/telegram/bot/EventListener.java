package org.motometer.telegram.bot;

@FunctionalInterface
public interface EventListener<E> {

    void onEvent(E event) throws BotException;
}
