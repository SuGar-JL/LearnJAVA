package com.sugar.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @ClassName: demo_ArrayList
 * @description: ArrayList是基于数组实现的集合
 * @author: sujiling
 * @date: 2020/7/14 19:26
 */
public class demo_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        //在方法上与List接口有很多下相同的
        list.add("宝马");
        list.add("奔驰");
        System.out.println(list);//[宝马, 奔驰]
        ListIterator<String> stringListIterator = list.listIterator();//可以从头到尾，也可以从尾到头
        //正向遍历
        while (stringListIterator.hasNext()) {
            String str = stringListIterator.next();
            if ("奔驰".equals(str)) {
                stringListIterator.add("兰博基尼");//加在末尾
            }
            System.out.print(str + "、");//宝马、奔驰、
        }
        System.out.println("");
        System.out.println(list);//[宝马, 奔驰, 兰博基尼]
        //反向遍历（前提：指针在列表最后位置，所以需先正向遍历）
        while (stringListIterator.hasPrevious()) {
            String str = stringListIterator.previous();
            System.out.print(str + "、");//兰博基尼、奔驰、宝马、
        }
        Iterator<String> iterator = list.iterator();//只能从头到尾

    }
}
