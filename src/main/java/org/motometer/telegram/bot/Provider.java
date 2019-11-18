package org.motometer.telegram.bot;

/**
 * Base interface to provide implementations of API via {@link java.util.ServiceLoader}
 * @param <T>
 */
public interface Provider<T> {

    T provide();
}
