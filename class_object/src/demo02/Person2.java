package demo02;

/**
 * @ClassName: Person2
 * @description:
 * @author: sujiling
 * @date: 2020/7/3 19:48
 */
public class Person2 {

    protected String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + "、年龄：" + this.age;
    }
}
