package com.sugar.demo_maipiao;

/**
 * @ClassName: MyThread
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 15:38
 */
public class MyThread implements Runnable {
    private int ticket = 10;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (ticket > 0) {
                //模拟网络延迟
                //此时由于不同步，可能会有负值，或者两个或多个线程卖出同一张票
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //使用Thread.currentThread().getName()获取当前运行的线程的名字
                System.out.println(Thread.currentThread().getName() + "卖票" + ticket--);
            } else {
                System.out.println("没票了！");
            }
        }
    }
}
