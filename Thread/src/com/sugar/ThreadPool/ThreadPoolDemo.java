package com.sugar.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: ThreadPoolDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/19 13:09
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {

        //1.使用Executors接口的newFixedThreadPool（int nTreads）静态方法创建线程池对象（ExecutorService接口对象）
        ExecutorService executorService = Executors.newFixedThreadPool(2);//有2个线程的线程池

        //2.创建Runnable实现类RunnableImpl，重写其中的run方法

        //3.使用ExecutorService接口的submit方法传入Runnable实现类对象，获取线程并启动线程任务
        executorService.submit(new RunnableImpl1());//pool-1-thread-1线程执行1
        executorService.submit(new RunnableImpl2());//pool-1-thread-1线程执行3
        executorService.submit(new RunnableImpl3());//pool-1-thread-2线程执行2
        //4.使用使用ExecutorService接口的shutdown方法销毁线程池（不推荐销毁，因为销毁后就不能用了）
        executorService.shutdown();
    }
}
