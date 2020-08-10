package com.sugar.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @ClassName: demo_List
 * @description:
 * @author: sujiling
 * @date: 2020/7/12 16:36
 */
public class demo_List {

    public static void main(String[] args) {
        /*
         * List也是一个接口，继承自Collection，拥有Collection的方法
         * */
        //创建一个List集合
        List list = new ArrayList();

        //add():向集合添加元素，与Collection一样
        list.add("奔驰");
        list.add("宝马");
        //输出集合(List接口有重写toString())
        System.out.println(list);//[奔驰, 宝马]

        //返回哈希码值
        System.out.println(list.hashCode());//23969300

        //set():方法修改集合指定位置元素
        list.set(0, "sugar");
        System.out.println(list);//[sugar, 宝马]

        //size():获得集合长度
        System.out.println("集合长度：" + list.size());//集合长度：2

        //get():通过索引获取集合元素
        //当知道集合存储的数据类型是啥时，可以进行强转
        String value = (String) list.get(1);
        System.out.println(value);//宝马

        //add(index,element):在指定位置加入元素
        list.add(1, "劳斯莱斯");
        System.out.println(list);//[sugar, 劳斯莱斯, 宝马]

        //ListIterator
        System.out.println("-----使用ListIterator遍历List集合-----");
        /*注意：
         * 使用ListIterator进行遍历，可以使用ListIterator的对象对list进行添加操作（不能修改、删除），但是在本次遍历中并不会遍历出来*/
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if ("劳斯莱斯".equals(str)) {
                //不能使用list.add("兰博基尼);
                listIterator.add("兰博基尼");//sugar、劳斯莱斯、宝马、(没输出兰博基尼)
//                listIterator.set("劳斯莱斯");//错误写法
//                listIterator.remove();//错误写法
            }
            System.out.print(str + "、");
        }
        System.out.println("");
        System.out.println("-----再次用同一个迭代器输出list：不会输出任何内容，因为迭代器只能被使用一次！-----");
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            System.out.println(str);
        }

        System.out.println("-----使用for循环遍历List集合-----");
        //由于List有索引，相当于长度可变的数组，所以也可以使用for循环进行遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "、");
            if ("兰博基尼".equals(list.get(i))) {
                list.add("我的名车");
            }
        }//sugar、劳斯莱斯、兰博基尼、宝马、我的名车、
        System.out.println("");

        System.out.println("-----使用增强型for循环遍历List集合-----");
        //不支持并发，只能修改数据，不能增加和修改数据
        for (Object o : list) {
            String str = (String) o;
            if ("我的名车".equals(str)) {
//                list.remove("sugar");//不能这么写，因非线程安全
//                list.add("sjl");//不能这么写，因非线程安全
                list.set(0,"SUGAR");//本次遍历不输出
            }
            System.out.print(str + "、");
        }//sugar、劳斯莱斯、兰博基尼、宝马、我的名车、
        System.out.println("");

        System.out.println("--------------------------------------------------------");
        //of()，JAVA 9的方法：将给的多个数据转为List集合
//        List list1 = List.of("宝马","奔驰");
//        System.out.println(list1);//[宝马，奔驰]


        /*
         * 也有与StringBuffer那样的方法：indexOf()和lastIndexOf()
         * */
        list.add("SUGAR");
        System.out.println(list);//[SUGAR, 劳斯莱斯, 兰博基尼, 宝马, 我的名车, SUGAR]
        int indexOf = list.indexOf("SUGAR");
        System.out.println("sugar第一次出现的索引：" + indexOf);//sugar第一次出现的索引：0SUGAR
        int lastIndexOf = list.lastIndexOf("SUGAR");
        System.out.println("sugar最后一次出现的索引：" + lastIndexOf);//sugar最后一次出现的索引：5

        System.out.println("----------------------------------");
        /*删除集合元素*/
        //1.根据索引，返回删除的元素
        Object remove = list.remove(0);
        System.out.println("删除了：" + remove);//删除了：sugar
        System.out.println("删除后的list：" + list);//删除后的list：[劳斯莱斯, 兰博基尼, 宝马, 我的名车, sugar]

        //2.根据元素值，返回boolean值
        boolean sugar = list.remove("sugar");
        System.out.println("删除sugar了没：" + sugar);//true
        System.out.println("删除后的list：" + list);//删除后的list：[劳斯莱斯, 兰博基尼, 宝马, 我的名车]

        //3.根据给的集合内容删除
        List list1 = new ArrayList<>();
        list1.add("劳斯莱斯");
        list1.add("宝马");
        boolean removeAll = list.removeAll(list1);
        System.out.println("兰博基尼和宝马了没：" + sugar);//true
        System.out.println("删除后的list：" + list);//删除后的list：[兰博基尼, 我的名车]

        /*清空集合*/
        list.clear();
        System.out.println(list);//[]

    }
}
