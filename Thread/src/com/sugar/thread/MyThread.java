package com.sugar.thread;

/**
 * @ClassName: MyThread
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 15:07
 */
public class MyThread extends Thread{
    private String title;

    public MyThread(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            System.out.println(this.title+"运行，x = " + x);
        }
    }
}
