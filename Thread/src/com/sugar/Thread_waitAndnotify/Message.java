package com.sugar.Thread_waitAndnotify;

/**
 * @ClassName: Message
 * @description:
 * @author: sujiling
 * @date: 2020/7/17 21:17
 */
public class Message {
    private String title;
    private String content;
    private boolean flag = true;
    //flag = true: 允许生产，不允许消费
    //flag = false: 允许消费，不允许生产
    private int count1;
    private int count2;

    public synchronized void set(String title, String content) {
        if (!this.flag) {
            try {
                super.wait();//该消费了，生产者等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.title = title;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        this.flag = false;
        super.notify();//该消费了，唤醒消费者
    }

    public synchronized String get() {
        if (this.flag) {
            try {
                super.wait();//该消费了，消费者者等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            return this.title + " - " + this.content;
        } finally {
            this.flag = true;
            super.notify();//该生产了，唤醒生产者
        }
    }
}
