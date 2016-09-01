package com.isharipov;

/**
 * @since 01.09.2016
 */
public class Main {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPoolImpl(3);

        threadPool.execute(() -> System.out.println(1));
        threadPool.execute(() -> System.out.println(2));
        threadPool.execute(() -> System.out.println(3));
        threadPool.execute(() -> System.out.println(4));
        threadPool.execute(() -> System.out.println(5));
        threadPool.execute(() -> System.out.println(6));
        threadPool.execute(() -> System.out.println(7));
        threadPool.execute(() -> System.out.println(8));
        threadPool.execute(() -> System.out.println(9));
        threadPool.execute(() -> System.out.println(10));
        threadPool.execute(() -> System.out.println(11));
        threadPool.execute(() -> System.out.println(12));
        threadPool.execute(() -> System.out.println(13));
        threadPool.execute(() -> System.out.println(14));
        threadPool.execute(() -> System.out.println(15));
        threadPool.execute(() -> System.out.println(16));

        threadPool.start();

    }
}
