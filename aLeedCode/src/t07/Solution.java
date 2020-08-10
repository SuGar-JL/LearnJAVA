package t07;

/**
 * @ClassName: Solution
 * @description:
 * @author: sujiling
 * @date: 2020/8/6 23:20
 */
class Solution {
    public static void main(String[] args) {
        int x = -2147483648;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println((int) Math.pow(2, 31));
        System.out.println("结果：" + reverse(x));

    }

    public static int reverse(int x) {
        if (x == 0 || x == Integer.MIN_VALUE) {//为啥x = MIN_VALUE不行？？？？？
            return 0;
        }
        //1.把x转整数
        int y = x > 0 ? x : (0 - x);
        String z = "" + y;
        char[] arr = z.toCharArray();
        double temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            double j = Math.pow(10, i);
            int k = Integer.parseInt(new String(arr, i, 1));
            temp = temp + j * k;
        }

        if (temp > Integer.MAX_VALUE) {
            return 0;
        } else {
            temp = x > 0 ? temp : temp * (-1);
            int result = (int) temp;
            return result;
        }
    }
}
