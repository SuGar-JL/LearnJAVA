package com.sugar.ThreadSleep;

/**
 * @ClassName: ThreadDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 16:54
 */
public class ThreadDemo {

    public static void main(String[] args) {

        Runnable run = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ", i = " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        for (int num = 0; num < 5; num++) {
            new Thread(run, "thread - " + num).start();
        }
    }
}
