package com.sugar.ThreadTest;

/**
 * @ClassName: com.sugar.ThreadTest.MyThreadTest
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 15:14
 */
public class MyThreadTest {
    private String title;

    public MyThreadTest(String title) {
        this.title = title;
    }

    public void print(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title+ "运行，i = " + i);
        }
    }
}
