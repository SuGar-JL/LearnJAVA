package com.sugar.class_file.demo01;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: demo05_ctreateF
 * @description:
 * @author: sujiling
 * @date: 2020/7/25 21:54
 */
public class demo05_ctreateF {
    public static void main(String[] args) {
        /*
           File类关于创建的方法
           1.boolean createNewFile()  当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
           2.boolean mkdir()  创建由此抽象路径名命名的目录。
           3.boolean mkdirs()  创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
           4.boolean delete()  删除由此抽象路径名表示的文件或目录。
        */

        /*
        * 1.创建文件：
        * boolean createNewFile()：创建的路径在File类的构造方法中给出
        * 返回值：
        *   true:当要创建的文件不存在时，创建文件
        *   false:文件存在时
        * 注意：
        *   1.此方法只能创建文件，不能创建文件夹，当以创建文件夹格式操作时，创建的依然是文件
        *   2.创建文件的路径要存在，不然会报IOException
        * */
        //绝对路径，路径存在且文件不存在
        File file = new File("D:\\学习\\JAVA\\input&output\\1.txt");
        try {
            boolean b1 = file.createNewFile();
            System.out.println("b1:"+b1);//b1:true
        } catch (IOException e) {
            e.printStackTrace();
        }
        //相对路径，路径存在且文件不存在
        File file1 = new File("2.txt");
        try {
            boolean b2 = file1.createNewFile();
            System.out.println("b2:"+b2);//b2:true
        } catch (IOException e) {
            e.printStackTrace();
        }
        //路径不存在
        File file2 = new File("D:\\学习\\JAVA\\input&outp\\1.txt");
        try {
            boolean b3 = file2.createNewFile();
            System.out.println("b3:"+b3);//java.io.IOException: 系统找不到指定的路径。
        } catch (IOException e) {
            e.printStackTrace();
        }
        //文件已存在存在
        File file3 = new File("D:\\学习\\JAVA\\input&output\\1.txt");
        try {
            boolean b4 = file3.createNewFile();
            System.out.println("b4:"+b4);//b4:false
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        * 2.boolean mkdir():创建单级文件夹
        * 创建路径及文件夹名称有构造方法给出
        * 返回值：
        *   true:文件夹不存在，创建
        *   false:文件夹已存在/给出的路径不存在
        * 注意：
        *   1.只能创建单级文件夹，不能创建文件，就算用文件名创建，类型还是文件夹
        * 
        * 3.boolean mkdirs()：创建多级文件夹（包括单级文件夹）
        * 创建路径及文件夹名称有构造方法给出
         * 返回值：
         *   true:文件夹不存在，创建
         *   false:文件夹已存在/给出的路径不存在
         * 注意：
         *   1.不能创建文件，就算用文件名创建，类型还是文件夹
        * */
        //绝对路径，文件夹不存在且路径存在
        File file4 = new File("D:\\学习\\JAVA\\input&output\\aaa");
        boolean b5 = file4.mkdir();
        System.out.println("b5:"+b5);//b5:true
        //文件夹存在
        File file5 = new File("D:\\学习\\JAVA\\input&output\\aaa");
        boolean b6 = file5.mkdir();
        System.out.println("b6:"+b6);//b6:false
        //路径不存在
        File file6 = new File("D:\\学习\\JAVA\\input&outp\\aaa");
        boolean b7 = file6.mkdir();
        System.out.println("b7:"+b7);//b7:false
        //相对路径
        File file7 = new File("bbb");
        boolean b8 = file7.mkdir();
        System.out.println("b8:"+b8);//b8:true
        //写成文件名
        File file8 = new File("bbb.txt");
        boolean b9 = file8.mkdir();
        System.out.println("b9:"+b9);//b9:true

        //创建多级文件夹
        File file9 = new File("D:\\学习\\JAVA\\input&output\\ccc\\ddd\\eee");
        boolean b10 = file9.mkdir();
        System.out.println("b10:"+b10);//b10:false
        File file10 = new File("D:\\学习\\JAVA\\input&output\\ccc\\ddd\\eee");
        boolean b11 = file10.mkdirs();
        System.out.println("b11:"+b11);//b11:true

        /*
        * boolean delete():删除文件夹/文件
        * 路径由构造方法给出
        * 返回值：
        *   true:文件夹中无内容，且删除文件夹/文件成功（已经删除过的也返回true）
        *   false:文件夹中有内容，不会删除，或路径不存在
        * 注意：
        *   此方法不经过电脑的回收站，谨慎使用
        * */
        //文件/文件夹（没东西）存在
        File file11 = new File("D:\\学习\\JAVA\\input&output\\1.txt");
        boolean delete = file11.delete();
        System.out.println(delete);//true
        File file12 = new File("2.txt");
        boolean delete1 = file12.delete();
        System.out.println(delete1);//true
        File file13 = new File("D:\\学习\\JAVA\\input&output\\aaa");
        boolean delete2 = file13.delete();
        System.out.println(delete2);////true
        File file14 = new File("bbb");
        boolean delete3 = file14.delete();
        System.out.println(delete3);////true
        File file15 = new File("bbb.txt");
        boolean delete4 = file15.delete();
        System.out.println(delete4);////true
        File file16 = new File("D:\\学习\\JAVA\\input&output\\ccc\\ddd\\eee");//只删除了eee
        boolean delete5 = file16.delete();
        System.out.println(delete5);////true
    }
}
