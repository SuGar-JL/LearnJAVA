package com.sugar.set;

import com.sugar.set.custom_object_sort.Person;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName: demo_TreeSet
 * @description:
 * @author: sujiling
 * @date: 2020/7/15 13:43
 */
public class demo_TreeSet {

    public static void main(String[] args) {

        /*
        * 1.存储按升序
        * 2.不能存储null值
        * 其它与HashSet一样
        * */
        Set<String> set =new TreeSet<>();
        set.add("aaa");
        set.add("aaa");
        set.add("fff");
        set.add("eee");
        set.add("ddd");
        set.add("ccc");
        set.add("bbb");
//        set.add(null);//java.lang.NullPointerException 不能存储null值

        System.out.println(set);//[aaa, bbb, ccc, ddd, eee, fff]

        //存储自定义对象，要求自定义对象实现java.lang.Comparable接口的compareTo方法（属于内部比较器）
        Set<Person> set1 = new TreeSet<>();
        Person per = new Person("张三", 12);
        Person per1 = new Person("李四", 10);
        Person per2 = new Person("王二", 14);
        Person per3 = new Person("王五", 14);
        set1.add(per);
        set1.add(per1);
        set1.add(per2);
        set1.add(per3);
        System.out.println(set1);//[Person{name='李四', age=10}, Person{name='张三', age=12}, Person{name='王二', age=14}, Person{name='王五', age=14}]

    }
}
