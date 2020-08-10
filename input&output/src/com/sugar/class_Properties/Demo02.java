package com.sugar.class_Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: Demo02
 * @description:
 * @author: sujiling
 * @date: 2020/7/30 23:26
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileReader fis = new FileReader("D:\\学习\\JAVA\\input&output\\src\\com\\sugar\\class_Properties\\a.txt");
        Properties properties = new Properties();
        properties.load(fis);
        Set<String> strings = properties.stringPropertyNames();
        for (String key : strings) {
            System.out.println(key + "-->" + properties.getProperty(key));
        }
    }
}
