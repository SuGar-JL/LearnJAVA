package demo01;

import java.util.Properties;
import java.util.Set;

/**
 * @ClassName: System_getProperty
 * @description:
 * @author: sujiling
 * @date: 2020/7/11 13:49
 */
public class System_getProperty {
    public static void main(String[] args) {
//        int i = 0;
//        System.out.println(getType(i));
        /*获取系统的所有属性*/
        Properties properties = System.getProperties();
        Set<Object> objects = properties.keySet();
        for (Object object : objects) {
            String key = (String) object;
            String value = properties.getProperty(key);
            System.out.println(key + "--->" + value);
        }
        /*根据某个key获取属性*/
        String property = System.getProperty("java.home");
        System.out.println("java.home:"+property);

    }

    public static String getType(Object o) {
        return o.getClass().toString();
    }
}
