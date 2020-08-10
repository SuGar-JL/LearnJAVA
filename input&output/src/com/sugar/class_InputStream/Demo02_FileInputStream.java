package com.sugar.class_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName: Demo02_FileInputStream
 * @description:
 * @author: sujiling
 * @date: 2020/7/30 21:38
 */
public class Demo02_FileInputStream {
    public static void main(String[] args) throws IOException {
        //构造方法
        //1
        File f = new File("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_InputStream\\inputstream\\a.txt");
        FileInputStream fis = new FileInputStream(f);
        //2
        FileInputStream fis1 = new FileInputStream("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_InputStream\\inputstream\\a.txt");

        //从a.txt读数据
        fisRead(fis1);
        System.out.println("--------------------");
        fisRead1(fis);
    }

    private static void fisRead1(FileInputStream fis) throws IOException {
        //用字节数组读（提高性能）
        byte[] b = new byte[2];//
        int len;//读取到的长度
        while ((len = fis.read(b)) != -1){
//            System.out.println(new String(b));//有无效字节
            System.out.println(new String(b,0,len));
        }
        fis.close();
    }

    private static void fisRead(FileInputStream fis) throws IOException {
        //一次读一个字节
        int r;
        while ((r = fis.read()) != -1){
            System.out.println((char)r);
        }
        fis.close();
    }
}
