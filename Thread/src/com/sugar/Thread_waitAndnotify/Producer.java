package com.sugar.Thread_waitAndnotify;

/**
 * @ClassName: Producer
 * @description:
 * @author: sujiling
 * @date: 2020/7/17 21:27
 */
public class Producer implements Runnable {
    private Message message = null;

    public Producer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0){
                this.message.set(i + ": sjl", "弟弟");
            } else {
                this.message.set(i + ": SuGar", "要做大神");
            }
        }
    }
}
