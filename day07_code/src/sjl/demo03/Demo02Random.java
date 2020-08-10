package sjl.demo03;

import java.util.Random;
/*
* 产生某范围内的随机数字*/
public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);//实际为0~9，取不到10
            System.out.println(num);

        }
    }
}
