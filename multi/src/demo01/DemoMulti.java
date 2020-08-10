package demo01;

/**
 * @ClassName: DemoMulti
 * @description: 多态中的成员变量的调用规则：【看左，没有向上找父类的】看实例化语句的左边，没有则找父类的
 * @author: sujiling
 * @date: 2020/7/2 13:49
 */
public class DemoMulti {
    public static void main(String[] args) {
        Fu fu = new Zi();//多态，向上转型
        fu.method1();//调用的被子类覆写的方法
        fu.method2();//没被子类覆写，调用父类的
//        fu.methodZi();//没法调用子类扩充的方法
        //进行强制向下转型（前提：先Fu fu = new Zi();向上转型）
        Zi zi = (Zi) fu;
        zi.methodZi();//这样才可以调用子类扩充的方法
        System.out.println(fu.num);//父类的10
        System.out.println(fu.numFu);//父类的10
//        System.out.println(fu.numZi);//不能调用
        System.out.println(zi.num);//子类的20
        System.out.println(zi.numFu);//父类的10
        System.out.println(zi.numZi);//子类的20
    }
}
