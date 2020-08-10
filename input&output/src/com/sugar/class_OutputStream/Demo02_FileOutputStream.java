package com.sugar.class_OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: Demo02_FileOutputStream
 * @description: 文件字节输出流：写数据到硬盘
 * @author: sujiling
 * @date: 2020/7/30 21:02
 */
public class Demo02_FileOutputStream {
    public static void main(String[] args) throws IOException {
        /*
        * 下面2个构造方法，再次写入数据会覆盖之前的数据
        * */
        //1
        File file = new File("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_OutputStream\\a\\a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //2
//        FileOutputStream fileOutputStream1 =new FileOutputStream("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_OutputStream\\a\\b.txt");

        /*
        * 下面2个构造方法，可以续写
        * */
        //3
        FileOutputStream fileOutputStream2 = new FileOutputStream(file,true);//append参数为true，对象支持续写
        //4
//        FileOutputStream fileOutputStream3 =new FileOutputStream("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_OutputStream\\a\\b.txt"，true);
        //
        fosWrite(fileOutputStream);
        //续写（如果关了流，要换一个流）
        fosWriteAgain(fileOutputStream2);//OPQRST


    }

    private static void fosWriteAgain(FileOutputStream fileOutputStream2) throws IOException {
        byte[] b = "OPQRST".getBytes();
        fileOutputStream2.write(b);
        //换行操作\r\n
        byte[] b1 = "\r\nuvwxyz".getBytes();
        fileOutputStream2.write(b1);
        fileOutputStream2.close();
    }

    private static void fosWrite(FileOutputStream fileOutputStream) throws IOException {
        //写单个字节
        fileOutputStream.write(97);//a
        fileOutputStream.write(98);//b
        fileOutputStream.write(99);//c
        //写字节数组
        byte[] b = "def".getBytes();
        fileOutputStream.write(b);//def
        //写指定长度的字节数组的部分
        byte[] b1 = "ghijklmn".getBytes();
        fileOutputStream.write(b1,1,7);//hijklmn
        //关闭流
        fileOutputStream.close();
    }
}
