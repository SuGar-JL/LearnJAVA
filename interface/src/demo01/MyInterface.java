package demo01;

/**
 * @ClassName: MyInterface
 * @description: 接口可以有以下类容：
 *               java 7
 *               1.常量
 *               2.抽象方法
 *               java 8
 *               3.默认方法
 *               4.静态方法
 *               java 9
 *               5.私有方法
 * @author: sujiling
 * @date: 2020/7/2 15:39
 */
public interface MyInterface {

    //常量
    public static final int num = 10;//必须初始化

    //抽象方法
    public abstract void method1();

    //默认方法
    default boolean method2(){
        return true;
    }

    //静态方法
    public static void methpd3(){

    }

    //私有方法
//    private void method4(){
//
//    }
}
