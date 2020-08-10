package com.sugar.ThreadPool;

/**
 * @ClassName: RunnableImpl1
 * @description:
 * @author: sujiling
 * @date: 2020/7/19 13:07
 */
public class RunnableImpl2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程执行2");
    }
}
