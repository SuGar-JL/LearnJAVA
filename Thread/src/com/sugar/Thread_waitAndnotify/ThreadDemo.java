package com.sugar.Thread_waitAndnotify;

/**
 * @ClassName: ThreadDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/17 21:32
 */
public class ThreadDemo {

    public static void main(String[] args) {

        Message message =new Message();

        new Thread(new Producer(message)).start();
        new Thread(new Consumer(message)).start();
    }
}
