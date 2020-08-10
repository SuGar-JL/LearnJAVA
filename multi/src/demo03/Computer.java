package demo03;

/**
 * @ClassName: Computer
 * @description:
 * @author: sujiling
 * @date: 2020/7/2 15:17
 */
public class Computer {

    public void powerOn(){
        System.out.println("打开计算机");
    }
    public void powerOff(){
        System.out.println("关闭计算机");
    }
    public void useDevice(IUSB iusb){
        iusb.open();
        if (iusb instanceof Mouse){
            ((Mouse) iusb).click();
        }else if (iusb instanceof KeyBoard){
            ((KeyBoard) iusb).type();
        }
        iusb.close();
    }
}
