package com.sugar.ThreadTest;

/**
 * @ClassName: ThreadDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 15:16
 */
public class ThreadDemo {

    public static void main(String[] args) {

        new MyThreadTest("A").print();
        new MyThreadTest("B").print();

        System.out.println(10/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
        //由于主线程出现异常，接下来的代码不执行，如果，下面这行代码是一个线程来执行，那么不会受到主线程出现异常的影响，仍然可以执行
        new MyThreadTest("C").print();
    }
}
