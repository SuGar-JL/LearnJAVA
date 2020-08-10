package com.sugar.Thread_Safe.demo_synchronized.demo03;

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
 *                   同步方法：
 *                   修饰符 synchronized 返回值类型 （参数列表）{
 *                       访问共享资源的代码
 *                   }
 *                 扩展：同步方法可以用静态方法，此时访问的成员属性也得时静态的，
 *                       此时，同步方法的锁对象不在是this，而是本类的class属性--->。class文件(反射)
 * @author: sujiling
 * @date: 2020/7/17 16:55
 */
public class RunnableImpl implements Runnable {

    //总票数
    private /*static*/ int ticket = 10;

    @Override
    public void run() {
        //调用同步方法
        while (this.saleTicket()) {
            ;
        }
    }

    //同步方法的同步锁实际为this
    private /*static*/ synchronized boolean saleTicket() {
        if (this.ticket > 0) {
            try {
                Thread.sleep(100);//模拟网络延迟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "线程在卖第" + this.ticket-- + "张票");
            return true;
        } else {
            System.out.println("票已经卖完了！");
            return false;
        }

        /*synchronized (RunnableImpl1.class){
            if (this.ticket > 0) {
                try {
                    Thread.sleep(100);//模拟网络延迟
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "线程在卖第" + this.ticket-- + "张票");
                return true;
            } else {
                System.out.println("票已经卖完了！");
                return false;
            }
        }*/
    }
}
