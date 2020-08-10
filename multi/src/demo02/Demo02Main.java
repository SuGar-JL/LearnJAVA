package demo02;

/**
 * @ClassName: Demo02Main
 * @description: 多态中成员方法调用规则：【编译看左，运行看右】
 *               看Animal animal = new Cat();左边即animal有没有该方法，有则编译通过。
 *               然后看右边，即Cat类有没有覆写过该方法，覆写过则调用覆写后的方法。
 *
 *               向下转型规则：【需先有向上转型，然后原路返回】
 *               即：Cat-向上->animal,那么必须animal-向下->Cat
 * @author: sujiling
 * @date: 2020/7/2 14:43
 */
public class Demo02Main {
    public static void main(String[] args) {
        Animal animal = new Cat();//向上转型
        //调用Cat类覆写的方法
        animal.eat();//猫吃鱼
        //不能调用Cat类特有的方法catchouse()
//        animal.catchMouse();
        //要调用Cat类特有的方法catchouse()，需向下转型回Cat类
        Cat cat = (Cat) animal;
        cat.catchMouse();//猫抓老鼠
        //此时animal不能下转型为Dog类,编译不报错，但运行报错：ClassCastException
//        Dog dog = (Dog)animal;//错误写法！
        //以下正确
        Animal animal1 = new Dog();
        animal1.eat();//狗吃骨头
        Dog dog1 = (Dog)animal1;
        dog1.watchHouse();//狗看家
    }
}
