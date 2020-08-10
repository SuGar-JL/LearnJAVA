package demo01;

import java.util.function.Function;

/**
 * @ClassName: Demo01Main
 * @description:    调用java.util.functio包中的【功能型】函数式接口：
 *                  @FunctionalInterface
 *                  public interface Function<T,R>{
 *                      public R apply(T t);
 *                  }
 * @author: sujiling
 * @date: 2020/7/2 17:56
 */
public class Demo01Main {
    public static void main(String[] args) {
        Function<String,Boolean> fun = "SuGarSJL"::startsWith;
        System.out.println(fun.apply("Su"));//true
    }
}
