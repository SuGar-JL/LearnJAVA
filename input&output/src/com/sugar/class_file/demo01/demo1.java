package com.sugar.class_file.demo01;

import java.io.File;

/**
 * @ClassName: demo1
 * @description: java.io.File类
 *               使用其中的方法可以：
 *                  创建、删除、获取文件/文件夹，判断文件/文件夹是否存在，遍历文件夹，获取文件大小
 *               File类与系统无关，任何系统都可用
 *               三个单词：
 *               class_file:文件
 *               directory:文件夹（目录）
 *               path:路径
 * @author: sujiling
 * @date: 2020/7/25 16:49
 */
public class demo1 {

    public static void main(String[] args) {

        /*
        * 四个静态成员变量：
        * static String pathSeparator  与系统相关的路径分隔符字符，为方便起见，表示为字符串。
          static char pathSeparatorChar  与系统相关的路径分隔符。
          static String separator  与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
          static char separatorChar  与系统相关的默认名称分隔符。
         */
        String pathSeparator = File.pathSeparator;//与pathSeparatorChar输出其实是一样的
        System.out.println(pathSeparator);//;  路径分隔符（系统环境变量中path），windows->;  Linux->:

        String separator = File.separator;//与separatorChar输出其实是一样的
        System.out.println(separator);//\  文件路径分隔符，windows->\（反斜杠）  Linux->/（正斜杠）
        /*
        * 注意：
        * 在以后，代码种写文件路径名时，最好这样写：
        * "C:"+File.separator+"XXX"+File.separator+"XXXX"....
        * */
    }
}
