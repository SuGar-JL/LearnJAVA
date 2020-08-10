package collections.com.sugar.custom_object_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: collection_sort
 * @description:
 * @author: sujiling
 * @date: 2020/7/15 14:42
 */
public class collection_sort {

    public static void main(String[] args) {

        /*
         * 用Collections工具类排序
         * 要求：
         * 1.自定义对象有内部比较器：实现Comparable接口的CompareTo方法
         * 2.给自定义对象写一个外部比较器：实现Comparator接口的Compare方法
         * */
        List<Person> list = new ArrayList<>();
        //1.Person类有内部比较器
        Person per = new Person("张三", 12);
        Person per1 = new Person("王二", 15);
        Person per2 = new Person("麻子", 13);
        Person per3 = new Person("李四", 14);
        list.add(per);
        list.add(per1);
        list.add(per2);
        list.add(per3);
        System.out.println(list);//[Person{name='张三', age=12}, Person{name='王二', age=15}, Person{name='麻子', age=13}, Person{name='李四', age=14}]
        Collections.sort(list);
        System.out.println(list);//[Person{name='张三', age=12}, Person{name='麻子', age=13}, Person{name='李四', age=14}, Person{name='王二', age=15}]

        //2.Student类有外部比较器Stu_Comparator
        List<Student> list1 = new ArrayList<>();
        Student stu = new Student("张三", 12);
        Student stu1 = new Student("王二", 15);
        Student stu2 = new Student("麻子", 13);
        Student stu3 = new Student("李四", 14);
        list1.add(stu);
        list1.add(stu1);
        list1.add(stu2);
        list1.add(stu3);
        System.out.println(list1);//[Person{name='张三', age=12}, Person{name='王二', age=15}, Person{name='麻子', age=13}, Person{name='李四', age=14}]
        Collections.sort(list1, new Stu_Comparator());
        System.out.println(list1);//[Person{name='张三', age=12}, Person{name='麻子', age=13}, Person{name='李四', age=14}, Person{name='王二', age=15}]
    }
}
