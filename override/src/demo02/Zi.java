package demo02;

/**
 * @ClassName: Zi
 * @description:
 * @author: sujiling
 * @date: 2020/7/1 16:47
 */
public class Zi extends Fu{
    /*
    * 子类的返回值类型范围大于父类，通过@Override注解检测，方法覆写失败
    * java.lang.Object类是所有类的公共最高父类，java.lang.String类是Object的子类
    * */
//    @Override
//    public Object method(){
//        return null;
//    }

    /*
    * 正确写法
    * */
    @Override//方法覆写声明
//    @Deprecated//弃用声明
    public String method(){
        return null;
    }
}
