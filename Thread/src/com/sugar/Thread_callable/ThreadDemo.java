package com.sugar.Thread_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName: ThreadDemo
 * @description: Runnable接口的run方法没有返回值，而Callable接口中的call方法有返回值
 * @author: sujiling
 * @date: 2020/7/16 16:22
 */
public class ThreadDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //使用FutureTask接口将Callable与Thread联系起来
        FutureTask<String> task = new FutureTask<>(new MyThread());
        //还是使用Thread进行线程的启动
        new Thread(task).start();

        //获取线程返回的数据
        System.out.println(task.get());

    }
}
