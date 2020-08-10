package com.sugar.class_Properties;

import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: Demo01
 * @description:
 * @author: sujiling
 * @date: 2020/7/30 23:17
 */
public class Demo01 {
    public static void main(String[] args) {
        //构造方法
        Properties properties = new Properties();
        //设置内容
        properties.setProperty("01", "张三");
        properties.setProperty("02", "李四");
        properties.setProperty("03", "王二");
        //获取内容
        String property = properties.getProperty("01");
        String property1 = properties.getProperty("02");
        String property2 = properties.getProperty("03");
        System.out.println(property);//张三
        System.out.println(property1);//李四
        System.out.println(property2);//王二
        //遍历
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key + "-->" + properties.getProperty(key));
        }

    }
}
