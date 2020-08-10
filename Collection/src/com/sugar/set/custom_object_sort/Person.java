package com.sugar.set.custom_object_sort;

/**
 * @ClassName: Person
 * @description: 使用内部比较器进行自定义对象的比较，然后实现集合元素的排序存储
 * @author: sujiling
 * @date: 2020/7/15 13:53
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        //先通过年龄排序，若年龄相同，按姓名排序
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}
