package com.sugar.demo_maipiao;

/**
 * @ClassName: ThreadDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 15:41
 */
public class ThreadDemo {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        new Thread(thread, "A").start();//A是为线程起的名字
        new Thread(thread, "B").start();
        new Thread(thread, "C").start();

        /*某次运行结果（有两个线程卖同一张票）
        *   B卖票9
            A卖票10
            C卖票8
            C卖票7
            B卖票6
            A卖票5
            C卖票4
            B卖票3
            A卖票2
            C卖票1
            B卖票0
            没票了！
            没票了！
            没票了！
            没票了！
            没票了！
            没票了！
            A卖票1
            没票了！
            没票了！
            没票了！
            没票了！
            没票了！
            没票了！
            没票了！
            没票了！
            没票了！
            没票了！
            没票了！
            没票了！
        * */

        //main方法为主线程
//        thread.run();//main
    }
}
