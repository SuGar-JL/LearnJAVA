package class_system;

/**
 * @ClassName: class_system.Array_Copy
 * @description: 使用System类的arrayaopy方法进行数组的复制操作
 * @author: sujiling
 * @date: 2020/7/4 21:24
 */
public class Array_Copy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {11,22,33,44,55,66};
        System.arraycopy(arr1,5,arr2,3,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"、");
        }
    }
}
