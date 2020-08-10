package com.sugar.Thread_waitAndnotify;

/**
 * @ClassName: Consumer
 * @description:
 * @author: sujiling
 * @date: 2020/7/17 21:30
 */
public class Consumer implements Runnable {
    private Message message = null;

    public Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.message.get());
        }
    }
}
