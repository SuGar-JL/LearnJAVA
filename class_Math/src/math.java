/**
 * @ClassName: math
 * @description: Math类方法的使用
 * @author: sujiling
 * @date: 2020/7/1 12:09
 */
public class math {
    public static void main(String[] args) {
        System.out.println(Math.pow(3, 2));//3的二次方9
        System.out.println(Math.abs(-10.4));//取绝对值（取模）10.4
        System.out.println(Math.round(10.44));//四舍五入10
        System.out.println(Math.round(-0.3));//四舍五入0
        System.out.println(Math.round(-0.6));//四舍五入-1
        System.out.println(MathRoundUtil(3.141592653,4));//四舍五入，保留4位小数3.1416
        System.out.println(Math.ceil(3.1));//向上取整4.0
        System.out.println(Math.floor(3.9));//向下取整3.0
        System.out.println(Math.PI);//圆周率Π的近似值3.141592653589793
    }

    /**
     * @description:
     * @author: sujinling
     * @date: 2020/7/1 12:22
     * @param: num 要进行四舍五入的是数字
     * @param: scale 保留的小数位数
     * @return: void
     */
    public static double MathRoundUtil(double num, int scale) {
        return Math.round(num * Math.pow(10.0, scale)) / Math.pow(10.0, scale);
    }
}
