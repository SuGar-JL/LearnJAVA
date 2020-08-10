package com.sugar.class_Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName: Demo01_FileWriter
 * @description:
 * @author: sujiling
 * @date: 2020/7/30 22:29
 */
public class Demo01_FileWriter {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_Writer\\a.txt");
        FileWriter fr = new FileWriter(f);
        FileWriter fr1 = new FileWriter("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_Writer\\a.txt");
        //续写与字节流一样
        FileWriter fr2 = new FileWriter("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_Writer\\a.txt",true);
        //写单字符
        fr.write('苏');
        fr.write('金');
        fr.write('领');
        fr.write(97);//a
        fr.write(30000);//田
        //写换行
        fr.write('\r');
        fr.write('\n');
        //写字符数组
        char[] cbuf = {'苏','金','领','\r','\n'};
        fr.write(cbuf);
        fr.flush();//刷新缓冲区，流还可以继续使用
        //指定长度
        fr.write(cbuf,0,1);//苏
        //写字符串
        String str = "苏金领";
        fr.write(str);
        //指定长度
        fr.write(str,0,1);//苏
        /*  
        【注意】关闭资源时,与FileOutputStream不同。
        如果不关闭,数据只是保存到缓冲区，并未保存到文件。  
        */
        fr.close();
    }
}
