package demo01;

/**
 * @ClassName: Zi
 * @description:
 * @author: sujiling
 * @date: 2020/7/2 13:47
 */
public class Zi extends Fu{
    int num = 20;//父类也有一样的
    int numZi = 20;
    public void method1(){
        System.out.println("子类覆写了父类methoh1()方法");
    }
    public void methodZi(){
        System.out.println("子类扩充的方法methodZi()");
    }
}
