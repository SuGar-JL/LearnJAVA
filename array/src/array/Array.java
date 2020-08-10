package array;

public class Array {
    public static void main(String[] args) {
        //数组静态初始化
        int array1[] = {1, 2, 3};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("====");
        int array2[] = new int[]{4, 5, 6};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("====");
        int[] array3 = {7, 8, 9,};//一般这样写
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
