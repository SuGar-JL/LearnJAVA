package demo01;

/**
 * @ClassName: demo01.Zi
 * @description:
 * @author: sujiling
 * @date: 2020/7/1 16:17
 */
public class Zi extends Fu{
    /*
    * 父类中method方法为private，因此子类没法覆写
    * */
    public void method1(){
        System.out.println("子类的public方法1，无法覆写父类method1方法");
    }
    /*
     * 父类中method方法为public，因此子类可以覆写
     * */
    public void method2(){
        System.out.println("子类的public方法2，成功覆写父类method2方法");
    }
}
