package com.sugar;

/**
 * @ClassName: Anonymous_Inner_Class
 * @description:
 * @author: sujiling
 * @date: 2020/7/17 16:05
 */
public class Anonymous_Inner_Class {

    public static void main(String[] args) {

        //使用匿名内部类实现多线程
        //1.Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }.start();

        //2.Runnable

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }).start();
    }
}
