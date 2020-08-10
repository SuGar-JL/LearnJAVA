package demo01;

/**
 * @ClassName: Person
 * @description:
 * @author: sujiling
 * @date: 2020/7/2 17:39
 */
public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toSting() {
        return "姓名：" + this.name + "、年龄：" + this.age;
    }
}

