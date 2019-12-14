package org.motometer.telegram.bot;

@FunctionalInterface
public interface EventListener<E, R> {

    R onEvent(E event) throws BotException;
}
