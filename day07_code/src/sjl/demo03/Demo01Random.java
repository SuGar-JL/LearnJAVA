package sjl.demo03;

import java.util.Random;
/*
* 产生不指定范围的随机数字
* */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);
    }
}
