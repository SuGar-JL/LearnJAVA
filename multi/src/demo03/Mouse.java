package demo03;

/**
 * @ClassName: Mouse
 * @description:
 * @author: sujiling
 * @date: 2020/7/2 15:14
 */
public class Mouse implements IUSB{

    @Override
    public void open() {
        System.out.println("插上鼠标");
    }

    @Override
    public void close() {
        System.out.println("拔出鼠标");
    }

    public void click(){
        System.out.println("点击鼠标");
    }
}
