package demo03;

/**
 * @ClassName: Demo03Main
 * @description: 计算机USB接口案例
 *               继承+接口+接口作为方法参数+多态+instanceof关键字
 * @author: sujiling
 * @date: 2020/7/2 15:20
 */
public class Demo03Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        IUSB mouse = new Mouse();//向上转型
        KeyBoard keyboard = new KeyBoard();//没有向上转型

        //打开计算机
        computer.powerOn();
        //使用鼠标
        computer.useDevice(mouse);
        //使用键盘
        computer.useDevice(keyboard);//自动向上转型
//        computer.useDevice(new KeyBoard());//用匿名对象也可以
        //关闭计算机
        computer.powerOff();
    }
}
