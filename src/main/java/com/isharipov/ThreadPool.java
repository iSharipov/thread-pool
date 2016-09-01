package com.isharipov;

/**
 * @since 01.09.2016
 */
public interface ThreadPool {
    void execute(Runnable runnable);

    void start();

    Runnable take() throws InterruptedException;
}
