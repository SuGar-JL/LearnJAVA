package demo03;

/**
 * @ClassName: Person
 * @description:
 * @author: sujiling
 * @date: 2020/7/3 20:06
 */
public class Person extends Object {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //覆写Object,equals()方法来实现对象的比较
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Person per = (Person) obj;
        return this.name.equals(per.name) && this.age == per.age;
    }
}
