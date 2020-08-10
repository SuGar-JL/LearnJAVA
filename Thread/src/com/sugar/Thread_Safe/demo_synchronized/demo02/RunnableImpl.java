package com.sugar.Thread_Safe.demo_synchronized.demo02;

/**
 * @ClassName: RunnableImpl1
 * @description: 多个线程同时卖票，出现线程安全问题：
 *                  1.线程卖出相同的票（不合理）
 *                  2.线程卖出不存在的票（-1）
 *               解决方法一：使用同步代码块
 *                  同步代码块：
 *                      synchronized(同步对象/锁对象){
 *                          访问共享资源的代码
 *                      }
 *                方法二：使用同步方法
 *                  同步方法：
 *                  修饰符 synchronized 返回值类型 （参数列表）{
 *                      访问共享资源的代码
 *                  }
 * @author: sujiling
 * @date: 2020/7/17 16:55
 */
public class RunnableImpl implements Runnable {

    //总票数
    private int ticket = 10;

    //新建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //同步代码块，obj也可以直接用this（本类的对象）
            synchronized (obj) {
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
}
