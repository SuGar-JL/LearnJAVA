package com.sugar.class_file.demo03_digui;

import java.io.File;

/**
 * @ClassName: Demo02_DiGui_BianLiFile
 * @description:
 * @author: sujiling
 * @date: 2020/7/30 18:00
 */
public class Demo02_DiGui_BianLiFile {
    public static void main(String[] args) {
        File file = new File("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_file\\demo03_digui\\a");
        printDir(file);
    }

    private static void printDir(File file) {
        File[] F_list = null;
        if (file.isDirectory()) {
            F_list = file.listFiles();
            for (File s : F_list) {
                System.out.println("目录" + file.getName() + "的内容：");
                System.out.println(s.getName());
                if (s.isDirectory()) {
                    printDir(s);
                }
            }
        }
    }
}
