package com.sugar.class_Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: Demo01_FileReader
 * @description:
 * @author: sujiling
 * @date: 2020/7/30 22:18
 */
public class Demo01_FileReader {
    public static void main(String[] args) throws IOException {

        File f = new File("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_Reader\\a.txt");
        FileReader fr = new FileReader(f);
        FileReader fr1 = new FileReader("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_Reader\\a.txt");
        int len;
        //读单字符
        while ((len = fr.read()) != -1) {
            System.out.println((char) len);//苏金领
        }
        fr.close();
        //一次性读
        char[] cbuf = new char[1024];
        while ((len = fr1.read(cbuf)) != -1) {
            System.out.println(new String(cbuf, 0, len));
        }
        fr1.close();//苏金领
    }
}
