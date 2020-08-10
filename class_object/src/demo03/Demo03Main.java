package demo03;

/**
 * @ClassName: Demo03Main
 * @description: 通过覆写Object,equals()方法来实现对象的比较
 * @author: sujiling
 * @date: 2020/7/3 20:12
 */
public class Demo03Main {
    public static void main(String[] args) {
        Person per1 = new Person("sjl",10);
        Person per2 = new Person("sjl",10);
        Person per3 = new Person("SuGar",23);
        System.out.println(per1.equals(per2));//true
        System.out.println(per1.equals(per3));//false
//        Scanner sc = new Scanner(System.in);
    }
}
