package com.sugar.class_file.demo02_bianli_directory;

import java.io.File;

/**
 * @ClassName: BianLian_Files
 * @description:
 * @author: sujiling
 * @date: 2020/7/30 17:33
 */
public class BianLian_Files {
    public static void main(String[] args) {
        /*
         * public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
         * public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
         * */
        File file = new File("D:\\学习\\JAVA\\input&output\\src\\demo02_bianli_directory\\aaa");
        String[] f_list = file.list();
        for (String s : f_list) {
            System.out.print(s + "、");//a.java、a.txt、aaa、b.java、b.txt、bbb、
        }
        System.out.println("");

        File file1 =new File("D:\\学习\\JAVA\\input&output\\src\\demo02_bianli_directory\\aaa");
        File[] files = file1.listFiles();
        for (File file2 : files) {
            System.out.print(file2+"、");//D:\学习\JAVA\input&output\src\demo02_bianli_directory\aaa\a.java、D:\学习\JAVA\input&output\src\demo02_bianli_directory\aaa\a.txt、D:\学习\JAVA\input&output\src\demo02_bianli_directory\aaa\aaa、D:\学习\JAVA\input&output\src\demo02_bianli_directory\aaa\b.java、D:\学习\JAVA\input&output\src\demo02_bianli_directory\aaa\b.txt、D:\学习\JAVA\input&output\src\demo02_bianli_directory\aaa\bbb、
        }
        System.out.println("");
    }
}
