package com.sugar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: Demo_pectrueCopy
 * @description:
 * @author: sujiling
 * @date: 2020/7/30 22:04
 */
public class Demo_pectrueCopy {
    public static void main(String[] args) throws IOException {
        //把a文件夹中的图片复制到b文件夹
        FileInputStream fis = new FileInputStream("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\a\\努力奋斗.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\b\\nulifeidou.jpg");

        byte[] b = new byte[1024];
        int len;
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }

        fos.close();//先关闭输出流，输出完了就一定写完了
        fis.close();
    }

}
