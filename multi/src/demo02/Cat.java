package demo02;

/**
 * @ClassName: Cat
 * @description:
 * @author: sujiling
 * @date: 2020/7/2 14:40
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
