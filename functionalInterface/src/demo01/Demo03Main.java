package demo01;

import java.util.function.Supplier;

/**
 * @ClassName: Demo03Main
 * @description:    调用java.util.functio包中的【供给型】函数式接口：
 *                  @FunctionalInterface
 *                  public interface Supplier<R>{
 *                      public R get();
 *                  }
 * @author: sujiling
 * @date: 2020/7/2 18:08
 */
public class Demo03Main {
    public static void main(String[] args) {
        Supplier<String> su = "SuGar"::toLowerCase;
        System.out.println(su.get());

    }
}
