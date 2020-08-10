package com.sugar.Thread_callable;

import java.util.concurrent.Callable;

/**
 * @ClassName: MyThread
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 16:18
 */
public class MyThread implements Callable<String>{


    @Override
    public String call() throws Exception {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += i;
            System.out.println("线程运行，i = " + i);
        }
        return "总和为：" + total;
    }
}
