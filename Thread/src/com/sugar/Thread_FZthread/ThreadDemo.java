package com.sugar.Thread_FZthread;

/**
 * @ClassName: ThreadDemo
 * @description: 子线程的运行不影响主线程的运行
 * @author: sujiling
 * @date: 2020/7/16 16:45
 */
public class ThreadDemo {

    public static void main(String[] args) {

        System.out.println("主线程任务1");
        new Thread(() -> {
            int temp = 0;
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                temp += i;//耗时操作
            }
        }).start();

        System.out.println("主线程任务2");
        System.out.println("主线程任务3");
    }
}
