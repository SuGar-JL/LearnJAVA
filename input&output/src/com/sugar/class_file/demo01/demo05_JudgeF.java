package com.sugar.class_file.demo01;

import java.io.File;

/**
 * @ClassName: demo05_JudgeF
 * @description:
 * @author: sujiling
 * @date: 2020/7/25 18:59
 */
public class demo05_JudgeF {

    public static void main(String[] args) {

        /*
        * 判断方法：
        * 1.boolean exists()  测试此抽象路径名表示的文件或目录是否存在。
        * 2.boolean isDirectory()  测试此抽象路径名表示的文件是否为目录。
        * 3.boolean isFile()  测试此抽象路径名表示的文件是否为普通文件。
        * */

        //1.判断构造方法的路径是否存在
        File file = new File("C:\\test");
        System.out.println(file.exists());//false

        File file1 = new File("D:\\学习\\JAVA");
        System.out.println(file1.exists());//true

        //2.判断路径结尾是否为文件夹
            //路径存在，且结尾是文件夹，才返回true
        File file2 = new File("D:\\学习\\JAVA");
        System.out.println(file2.isDirectory());//true

        File file3 = new File("D:\\学习\\JAVA.txt");
        System.out.println(file3.isDirectory());//false

        File file4 = new File("D:\\学习\\JAVA\\java基础笔记.md");
        System.out.println(file4.isDirectory());//false

        //3.判断路径结尾是否为文件名
            //路径存在，且结尾是文件，才返回true
        File file5 = new File("D:\\学习\\JAVA");
        System.out.println(file5.isFile());//false

        File file6 = new File("D:\\学习\\JAVA.txt");
        System.out.println(file6.isFile());//false

        File file7 = new File("D:\\学习\\JAVA\\java基础笔记.md");
        System.out.println(file7.isFile());//true
    }
}
