package com.isharipov;

import java.util.Queue;

/**
 * @since 01.09.2016
 */
public class Worker extends Thread {

    private final ThreadPool threadPool;
    private final Queue<Runnable> queue;

    public Worker(Queue<Runnable> queue, ThreadPool threadPool) {
        this.queue = queue;
        this.threadPool = threadPool;
    }

    @Override
    public void run() {
        while (true) {
            Runnable runnable;
            try {
                runnable = threadPool.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            runnable.run();
            queue.remove(runnable);
        }
    }
}
