package class_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
* Arrays是数组操作类
* 常用方法：
* 1.static <T> List<T> asList(T... a): 返回一个受指定数组支持的固定大小的列表。
* 2.equals方法：比较两个数组是否相等
* 3.fill方法：用一个值填充给数组的每个元素
* 4.toString方法：数组转字符串
* 5.sort方法：数组元素排序，默认为升序，但可以根据传入的比较器指定顺序sort(T[] a, Comparator<? super T> c)
 * */
public class ArraysToOperatorArray {
    public static void main(String[] args) {
        int[] arr = {5,3,6,2,8,1,9,0,4};
        System.out.println(Arrays.toString(arr));//[5, 3, 6, 2, 8, 1, 9, 0, 4]
        //1.static <T> List<T> asList(T... a): 返回一个受指定数组支持的固定大小的列表。
        List<int[]> arrToList = Arrays.asList(arr);
        System.out.println(arrToList);//[[I@1540e19d]
        Integer[] arr1 = {5,3,6,2,8,1,9,0,4};
        List<Integer> arrToList1 = Arrays.asList(arr1);
        System.out.println(arrToList1);//[5, 3, 6, 2, 8, 1, 9, 0, 4]

        //2.equals方法：比较两个数组是否相等
        int[] arr2 = {5,3,6,2,8,1,9,0,4};
        System.out.println(Arrays.equals(arr,arr2));//true

        //3.fill方法：用一个值填充给数组的每个元素
        String[] strArr = new String[3];
        Arrays.fill(strArr,"aaa");
        System.out.println(strArr);//[Ljava.lang.String;@677327b6

        //4.toString方法：数组转字符串
        System.out.println(Arrays.toString(strArr));//[aaa, aaa, aaa]

        //5.sort方法：数组元素排序，默认为升序，自定义对象排序，需要比较器sort(T[] a, Comparator<? super T> c)
        Arrays.sort(arr);
        //默认升序
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5, 6, 8, 9]
        //自定义对象排序
        Person p1 = new Person("a",20);
        Person p2 = new Person("b",15);
        Person p3 = new Person("c",18);
        Person p4 = new Person("d",18);
        Person[] arrPer = {p1,p2,p3,p4};
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int flag = o1.getAge() - o2.getAge();
                if (flag == 0){
                    return o1.getName().compareTo(o2.getName());
                }
                return flag;
            }
        };
        Arrays.sort(arrPer,comparator);
        System.out.println(Arrays.toString(arrPer));//[Person{name='b', age=15}, Person{name='c', age=18}, Person{name='d', age=18}, Person{name='a', age=20}]
    }
}
