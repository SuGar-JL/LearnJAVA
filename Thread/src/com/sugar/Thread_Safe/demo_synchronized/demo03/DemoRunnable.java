package com.sugar.Thread_Safe.demo_synchronized.demo03;

/**
 * @ClassName: DemoRunnable
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
 *
 * @author: sujiling
 * @date: 2020/7/17 16:58
 */
public class DemoRunnable {

    public static void main(String[] args) {

        RunnableImpl run = new RunnableImpl();

        new Thread(run, "A").start();
        new Thread(run, "B").start();
        new Thread(run, "C").start();
    }
}
