package sjl.demo04;

/*
* 题目：
* 定义一个数组用来存放3个Person对象*/
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        System.out.println(array[0]);//null

        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("马尔扎哈",38);

        array[0] = one;
        array[1] = two;
        array[2] = three;


        System.out.println(array[0]);//地址值
        System.out.println(array[1]);//地址值
        System.out.println(array[2]);//地址值

        System.out.println(array[0].getName());//迪丽热巴
        System.out.println(array[0].getAge());//18
        System.out.println(array[1].getName());//古力娜扎
        System.out.println(array[1].getAge());//28
        System.out.println(array[2].getName());//马尔扎哈
        System.out.println(array[2].getAge());//38
    }
}
