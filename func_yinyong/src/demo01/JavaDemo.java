package demo01;

/**
 * @ClassName: JavaDemo
 * @description:    方法引用-->引用构造方法
 *                  函数式接口IFunction引用Person类的构造方法的功能到自己的creat方法
 * @author: sujiling
 * @date: 2020/7/2 17:46
 */
public class JavaDemo{
    public static void main(String[] args) {
        IFunction<Person> fun = Person::new;
        System.out.println(fun.creat("张三",20).toSting());
    }
}
