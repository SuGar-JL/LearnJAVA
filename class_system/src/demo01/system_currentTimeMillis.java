package demo01;

/**
 * @ClassName: system_currentTimeMillis
 * @description:
 * @author: sujiling
 * @date: 2020/7/4 21:05
 */
public class system_currentTimeMillis {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("开始时间：" + start + "ms");
        //执行一些操作
        String str = "";
        for (int i = 0; i < 3000; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("结束时间：" + end + "ms");
        System.out.println("用时：" + (end - start) + "ms");
    }
}
