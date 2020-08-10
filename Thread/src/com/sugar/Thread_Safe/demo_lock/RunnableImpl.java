package com.sugar.Thread_Safe.demo_lock;

import java.util.concurrent.locks.ReentrantLock;

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
 *                扩展：同步方法可以用静态方法，此时访问的成员属性也得时静态的，
 *                       此时，同步方法的锁对象不在是this，而是本类的class属性--->。class文件(反射)
 *                方法三：使用Lock锁
 *                Lock锁：java.util.concurrent.locks.Lock接口
 *                实现类：java.util.concurrent.locks.ReentrantLock implements Lock
 *
 *                使用方法：
 *                  1.在成员属性处创建一个ReentrantLock对象
 *                  2.在可能出现线程安全问题的代码前调用Lock接口中的lock方法获取锁
 *                  3.在可能出现线程安全问题的代码后调用Lock接口中的unlock方法释放锁
 * @author: sujiling
 * @date: 2020/7/17 16:55
 */
public class RunnableImpl implements Runnable {

    //总票数
    private int ticket = 10;

    //1.在成员属性处创建一个ReentrantLock对象
    private ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //2.在可能出现线程安全问题的代码前调用Lock接口中的lock方法获取锁
            reentrantLock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(100);//模拟网络延迟
                    System.out.println(Thread.currentThread().getName() + "线程在卖第" + ticket-- + "张票");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //3.在可能出现线程安全问题的代码后调用Lock接口中的unlock方法释放锁
                    reentrantLock.unlock();//无论是否有异常，都释放锁对象
                }
            } else {
                System.out.println("票已经卖完了！");
                //3.在可能出现线程安全问题的代码后调用Lock接口中的unlock方法释放锁
                reentrantLock.unlock();
                break;
            }
        }
    }
}
