package com.sugar.Thread_Lambda;

/**
 * @ClassName: ThreadDDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 15:24
 */
public class ThreadDDemo {

    public static void main(String[] args) {

        /*使用匿名内部类实现多线程
        * 好处：省去类对象的创建
        * 弊端：语法复杂
        * 表转格式：三个部分
        * 1.一些参数
        * 2.一个箭头
        * 3.一段代码
        * 格式：(参数列表) -> {重写方法的代码};
        *       ()：接口中抽象方法的参数列表，与调用普通方法的写法一样
        *       ->：传递的意思，把参数传递给方法体
        *       {}：重写方法的方法体
        * */
        //1.单独使用Thread
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "使用匿名内部类实现多线程Thread");
            }
        }.start();

        //2.Thread+Runnable
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "使用匿名内部类实现多线程Runnable");
            }
        }).start();

        /*用Lambda表达式实现多线程
        * 只有第一种写方法
        * */
        //1.Thread，此处调用的run方法就是Runnable中的run方法
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "使用匿名内部类实现多线程Thread_Lambda");
        }).start();

        //2.Runnable+Thread 好像没这种写法，似乎因为Runnable是抽象接口，不能实例化
        /*new Thread(new Runnable(() -> {
                System.out.println("Runnable+Thread 好像没这种写法");
        })).start();*/

    }
}
