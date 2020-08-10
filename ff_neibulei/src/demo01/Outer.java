package demo01;

/**
 * @ClassName: Outer
 * @description: 局部（方法中）内部类调用方法局部变量的规则
 * @author: sujiling
 * @date: 2020/7/2 18:45
 */
public class Outer {
    public void method(){
        int num = 10;//实际为final的
        String str = "SuGar";//实际为final的
        class Inner{
            public void print(){
                System.out.println(num);
                System.out.println(str);
            }

        }
        new Inner().print();
    }
}
