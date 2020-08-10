package com.sugar.class_file.demo01;

import java.io.File;

/**
 * @ClassName: demo04_getFunctions
 * @description:
 * @author: sujiling
 * @date: 2020/7/25 18:37
 */
public class demo04_getFunctions {

    public static void main(String[] args) {
        /*
        * 获取方法：
        * 1.String getAbsolutePath()  返回此抽象路径名的绝对路径名字符串。
        * 2.String getPath()  将此抽象路径名转换为路径名字符串。
        * 3.String getName()  返回由此抽象路径名表示的文件或目录的名称。
        * 4.long length()  返回由此抽象路径名表示的文件的长度。
        * */

        //1.获取绝对路径
        File file = new File("D:\\学习\\JAVA\\a.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);//D:\学习\JAVA\a.txt

        File file1 = new File("a.txt");
        String absolutePath1 = file1.getAbsolutePath();
        System.out.println(absolutePath1);//D:\学习\JAVA\a.txt

        //2.获取路径，是绝对路径就返回就对路径，是相对路径就返回相对路径
        File file2 = new File("D:\\学习\\JAVA\\a.txt");
        System.out.println(file2.getPath());//D:\学习\JAVA\a.txt

        File file3 = new File("a.txt");
        System.out.println(file3.getPath());//a.txt

        //3.获取路径结尾的文件名或文件夹名
        File file4 = new File("D:\\学习\\JAVA\\a.txt");
        System.out.println(file4.getName());//a.txt

        File file5 = new File("D:\\学习\\JAVA\\a");
        System.out.println(file5.getName());//a

        /*
        * 4.获取文件大小，文件夹没有大小概念
        *   文件不存在时返回0
        * */
        File file6 = new File("D:\\学习\\培训文档(1).pdf");//真实存在
        System.out.println(file6.length());//207118（字节）

        File file7 = new File("D:\\学习\\a.java");//不存在
        System.out.println(file7.length());//0

        File file8 = new File("D:\\学习\\jdk api 1.8_China");//获取文件夹大小
        System.out.println(file8.length());//0

        File file9 = new File("D:\\学习");//获取文件夹大小
        System.out.println(file9.length());//4096（这却有大小，是因为是项目所在文件夹的原因吗？）

    }
}
