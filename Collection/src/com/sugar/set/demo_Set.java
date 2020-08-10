package com.sugar.set;

import com.sugar.set.custom_object_remove_duplicates.Person;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: demo_Set
 * @description:
 * @author: sujiling
 * @date: 2020/7/15 13:34
 */
public class demo_Set {

    public static void main(String[] args) {

        //set模仿的是数学里的集合
        Set<String> set = new HashSet<>();

        //1.无序性（存储顺序与添加顺序无关）
        //2.元素唯一性（去重：比较对象的hashCode与equals）
        //3.可以存储一个null值
        //4.非线程安全
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("ddd");
        set.add(null);
        set.add(null);
        System.out.println(set);//[aaa, null, ccc, bbb, ddd]

        //5.存储自定义对象时的去重
        //自定义对象要覆写hashCode与equals方法，hashCode与equals相同才去重
        Set<Person> set1 = new HashSet<>();
        Person per = new Person("张三", 10);
        Person per1 = new Person("张三", 10);

        set1.add(per);
        set1.add(per1);
        System.out.println(set1);//[Person{name='张三', age=10}]

    }
}
