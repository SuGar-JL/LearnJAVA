package com.sugar.class_file.demo03_digui;

import java.io.File;

/**
 * @ClassName: Demo03_FilesSearch
 * @description:
 * @author: sujiling
 * @date: 2020/7/30 20:17
 */
public class Demo03_FilesSearch {
    public static void main(String[] args) {
        File file = new File("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_file\\demo03_digui\\a");
//        printDir(file);
        printDirUseFileFilter(file);
    }

    //用过滤器
    private static void printDirUseFileFilter(File file) {
        /*File[] filesList = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
        });*/
        //改为lambda
        File[] filesList = file.listFiles(pathname -> {
            return pathname.getName().endsWith(".java") || pathname.isDirectory();
        });
        for (File file1 : filesList) {
            if (file1.isFile()){
                System.out.println("文件名："+ file1.getName());
            }else{
                printDirUseFileFilter(file1);
            }
        }
    }

    //检索.java类型的文件
    private static void printDir(File file) {
        File[] F_list = file.listFiles();
        for (File s : F_list) {
            if (s.isFile()) {
                if (s.getName().endsWith(".java")) {
                    System.out.println(s.getName());
                }
            } else {
                printDir(s);
            }
        }
    }
}
