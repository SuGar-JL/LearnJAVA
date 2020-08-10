package demo02;

/**
 * @ClassName: Dog
 * @description:
 * @author: sujiling
 * @date: 2020/7/2 14:41
 */
public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void watchHouse(){
        System.out.println("狗看家");
    }
}
