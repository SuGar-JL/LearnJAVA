package demo01;

import java.util.function.Consumer;

/**
 * @ClassName: Demo02Main
 * @description:    调用java.util.functio包中的【消费型】函数式接口：
 *                  @FunctionalInterface
 *                  public interface Consumer<T>{
 *                      public accept(T t);
 *                  }
 * @author: sujiling
 * @date: 2020/7/2 18:03
 */
public class Demo02Main {
    public static void main(String[] args) {
        Consumer<String> con = System.out::println;
        con.accept("SuGar");
    }
}
