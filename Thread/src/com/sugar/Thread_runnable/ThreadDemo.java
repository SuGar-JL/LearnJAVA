package com.sugar.Thread_runnable;

import com.sugar.thread.MyThread;

/**
 * @ClassName: ThreadDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 15:11
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread threadA = new Thread(new MyThread("线程A"));
        Thread threadB = new Thread(new MyThread("线程B"));
        Thread threadC = new Thread(new MyThread("线程C"));
        threadA.start();
        threadB.start();
        threadC.start();

    }
}
