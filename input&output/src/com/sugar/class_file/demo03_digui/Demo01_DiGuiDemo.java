package com.sugar.class_file.demo03_digui;

/**
 * @ClassName: Demo01_DiGuiDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/30 17:49
 */
public class Demo01_DiGuiDemo {
    public static void main(String[] args) {
        /*
        * 注意事项：
            递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
            在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
            构造方法,禁止递归
        */
        int i = 0;
//        a(i);//Exception in thread "main" java.lang.StackOverflowError
        b(i);
    }

    private static void b(int i) {
        System.out.println("方法b执行了" + i + "次，且会停下来。");
        if(i == 10){
            return;
        }
        i++;
        b(i);
    }

    private static void a(int i) {
        System.out.println("方法a执行了" + i + "次，并且不会停下来。");
        i++;
        a(i);
    }
}
