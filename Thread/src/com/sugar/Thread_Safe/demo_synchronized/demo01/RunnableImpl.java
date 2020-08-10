package com.sugar.Thread_Safe.demo_synchronized.demo01;

/**
 * @ClassName: RunnableImpl1
 * @description:
 * @author: sujiling
 * @date: 2020/7/17 16:55
 */
public class RunnableImpl implements Runnable {

    //总票数
    private int ticket = 10;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);//模拟网络延迟
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "线程在卖第" + ticket-- + "张票");
            } else {
                System.out.println("票已经卖完了！");
                break;
            }
        }
    }
}
