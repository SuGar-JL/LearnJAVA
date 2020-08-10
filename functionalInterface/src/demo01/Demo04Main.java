package demo01;

import java.util.function.Predicate;

/**
 * @ClassName: Demo04Main
 * @description:    调用java.util.functio包中的【断言型】函数式接口：
 *                  @FunctionalInterface
 *                  public interface Predicate<T>{
 *                      public boolean test(T t);
 *                  }
 * @author: sujiling
 * @date: 2020/7/2 18:12
 */
public class Demo04Main {
    public static void main(String[] args) {
        Predicate<String> pr = "SuGar"::equalsIgnoreCase;
        System.out.println(pr.test("sugar"));
    }
}
