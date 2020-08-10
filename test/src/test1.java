import java.util.ArrayList;

/**
 * @ClassName: test1
 * @description:
 * @author: sujiling
 * @date: 2020/7/3 17:58
 */
public class test1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        print(array, 0, array.length - 1);
    }

    public static int print(int[] num, int left, int right) {

        System.out.println("左：" + left + "、右：" + right);
        if (left > right) {

            System.out.println("左：" + left + ">右：" + right);
            return 0;
        }
        int mid = left + (right - left) / 2;
        System.out.println("中间：" + mid);
        System.out.println(num[mid]);
        print(num, left, mid - 1);
        print(num, mid + 1, right);
        System.out.println("==========");
        return 0;
    }
}
