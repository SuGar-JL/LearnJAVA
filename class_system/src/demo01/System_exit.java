package demo01;

/**
 * @ClassName: System_exit
 * @description:
 * @author: sujiling
 * @date: 2020/7/11 13:40
 */
public class System_exit {
    public static void main(String[] args) {
        System.out.println("运行中1");
        System.out.println("运行中2");
        System.out.println("运行中3");
        /*退出java虚拟机JVM
        * 参数用作状态码；根据惯例，非 0 的状态码表示异常终止。
        * 该方法调用 Runtime 类中的 exit 方法。该方法永远不会正常返回。
        * 调用 System.exit(n) 实际上等效于调用：
        * Runtime.getRuntime().exit(n)
        */
        System.exit(1);
        System.out.println("运行中4");//无法运行
    }
}
