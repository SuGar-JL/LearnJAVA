package demo01;

/**
 * @ClassName: demo01.Fu
 * @description:
 * @author: sujiling
 * @date: 2020/7/1 16:15
 */
public class Fu {
    private void method1(){
        System.out.println("父类的private方法method1");
    }

    public void handle1(){
        this.method1();
    }
    public void method2(){
        System.out.println("父类的public方法");
    }
    public void handle2(){
        this.method2();
    }
}
