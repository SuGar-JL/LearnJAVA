package demo01;

/**
 * @ClassName: demo01.override
 * @description: 子类要覆写父类方法，那么子类的方法的访问权限不能比父类严格，访问权限大小关系：private<default(默认)<protected<public
 * @author: sujiling
 * @date: 2020/7/1 16:14
 */
public class override {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.handle1();//调用父类的，因为子类没有覆写成功。
        zi.handle2();//调用子类的，因为子类成功覆写了。
    }
}
