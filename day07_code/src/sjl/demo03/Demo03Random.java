package sjl.demo03;

import java.util.Random;
/*
* 生成指定范围的随机数
* 示例：[1,10]
* */
public class Demo03Random {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 10;
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(n)+1;
            System.out.println(num);//1~10
        }
    }

}
