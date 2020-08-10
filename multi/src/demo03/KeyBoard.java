package demo03;

/**
 * @ClassName: KeyBoard
 * @description:
 * @author: sujiling
 * @date: 2020/7/2 15:16
 */
public class KeyBoard implements IUSB {
    @Override
    public void open() {
        System.out.println("插上键盘");
    }

    @Override
    public void close() {
        System.out.println("拔出键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
