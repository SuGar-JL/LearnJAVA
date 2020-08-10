package demo01;

/**
 * @ClassName: Object_Array
 * @description:
 * @author: sujiling
 * @date: 2020/7/2 22:10
 */
public class Object_Array {
    public static void main(String[] args) {
        Object obj = new int[]{1,2,3};
        if(obj instanceof int[]){
            for (int x : (int[])obj) {
                System.out.println(x);
            }
        }

    }
}
