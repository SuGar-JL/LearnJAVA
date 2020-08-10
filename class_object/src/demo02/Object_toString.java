package demo02;

/**
 * @ClassName: Object_toString
 * @description: 获取对象信息方法：Object.toString()
 * @author: sujiling
 * @date: 2020/7/3 19:42
 */
public class Object_toString {
    public static void main(String[] args) {
        Person1 person = new Person1("sjl",20);
        //自动调用对象的toString()，由于没有覆写默认父类Object的toString()方法，默认输出地址值
        System.out.println(person);//地址值

        Person2 person2 = new Person2("SuGar",23);
        //自动调用对象的toString()，由于覆写了默认父类Object的toString()方法，按照覆写的方法输出
        System.out.println(person2);//姓名：SuGar、年龄：23
    }
}
