package com.sugar.class_file.demo01;

import java.io.File;

/**
 * @ClassName: demo03_constructors
 * @description:
 * @author: sujiling
 * @date: 2020/7/25 17:12
 */
public class demo03_constructors {
    public static void main(String[] args) {

        /*
        * File构造方法：
        * 1.File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
          2.File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例。
          3.File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
        * */
        //1.
        //用假路径
        File file1 = new File("C:\\test\\a.txt");//windows反斜杠\是转义字符，要用\进行转义
        System.out.println(file1);//C:\test\a.txt（有重写Object类的toString方法）

        //用真路径
        File file2 = new File("D:\\学习\\JAVA");
        System.out.println(file2);//D:\学习\JAVA

        //用相对路径
        File file3 = new File("a.txt");
        System.out.println(file3);//a.txt

        //2.
        File file4 = new File("C:\\", "test");
        System.out.println(file4);//C:\test

        //3.
        File file5 = new File(file4, "\\a.txt");
        System.out.println(file5);//C:\test\a.txt

    }

}
