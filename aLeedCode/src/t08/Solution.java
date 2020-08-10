package t08;

/**
 * @ClassName: Solution
 * @description:
 * @author: sujiling
 * @date: 2020/8/7 21:55
 */
public class Solution {
    public static void main(String[] args) {
        String str = "3.14159";
        //trim()：取出前后的空格
//        System.out.println(str.trim());
//        char[] a = str.trim().toCharArray();
//        System.out.println(a.length);
        int r = myAtoi(str);
        System.out.println("结果：" + r);

    }

    private static int myAtoi(String str) {

        //去除空字符
        String str1 = str.trim();
        //为空或仅包含空白字符
        if (str1.length() == 0) {
            return 0;
        }
        //首个非空字符不是数字（不包括0）或+、-号
        boolean f = (str1.charAt(0) < '0' || str1.charAt(0) > '9') && (str1.charAt(0) != '+' && str1.charAt(0) != '-');
        if (f) {
            return 0;
        }
        //首个非空字符是+或-，只有一个+、-号
        boolean f1 = str1.charAt(0) == '+' || str1.charAt(0) == '-';
        if (f1) {
            boolean f2 = str1.length() == 1;
            if (f2) {
                return 0;
            }
        }
        char[] chars = str1.toCharArray();
        StringBuilder sb = new StringBuilder();
        int index = -1;
        if (chars[0] == '+' || chars[0] == '-') {
            sb.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] > '0' && chars[i] <= '9') {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                return 0;
            }
            for (int i = index; i < chars.length; i++) {
                if (chars[i] >= '0' && chars[i] <= '9') {
                    sb.append(chars[i]);
                }
            }
        } else {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] > '0' && chars[i] <= '9') {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                return 0;
            }
            for (int i = index; i < chars.length; i++) {
                if (chars[i] >= '0' && chars[i] <= '9') {
                    sb.append(chars[i]);
                }
            }
        }
        double d = Double.parseDouble(sb.toString());
        if (d > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (d < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return  (int)d;
    }
}
