package com.isharipov;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @since 01.09.2016
 */
public class ThreadPoolImpl implements ThreadPool {

    private final int threads;
    private final Queue<Runnable> task = new ArrayDeque<>();

    public ThreadPoolImpl(int threads) {
        this.threads = threads;
    }

    public void execute(Runnable runnable) {
        add(runnable);
    }

    public void start() {
        for (int i = 0; i < threads; i++) {
            new Worker(task, this).start();
        }
    }

    public synchronized void add(Runnable runnable) {
        task.add(runnable);
        this.notify();
    }

    public synchronized Runnable take() throws InterruptedException {
        if (task.size() == 0) {
            this.wait();
        }

        this.notify();
        return task.poll();
    }
}
