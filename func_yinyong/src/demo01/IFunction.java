package demo01;

/**
 * @ClassName: IFunction
 * @description:
 * @author: sujiling
 * @date: 2020/7/2 17:46
 */
//此注释表示该接口为函数式接口：只有一个抽象方法，但可以有普通方法和静态方法
@FunctionalInterface
interface IFunction<R>{
    public R creat(String n, int a);
}
