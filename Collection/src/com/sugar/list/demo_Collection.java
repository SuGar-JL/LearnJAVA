package com.sugar.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName: demo_Collection
 * @description:
 * @author: sujiling
 * @date: 2020/7/12 16:18
 */
public class demo_Collection {

    public static void main(String[] args) {
        Collection coll = new ArrayList();//Colleciotn是接口，通过子类实例化
        //添加元素
        coll.add("奔驰");
        coll.add("宝马");
        //输出
        System.out.println(coll);//[奔驰, 宝马]
        //获得集合长度
        System.out.println("集合长度："+coll.size());//集合长度：2
        //新创建一个集合
        Collection coll1 = new ArrayList();
        coll1.add(1);
        coll1.add(2);
        coll1.add(3);
        //将新集合coll1的内容加入集合coll中
        coll.addAll(coll1);
        System.out.println(coll);//[奔驰, 宝马, 1, 2, 3]
        //将集合coll1加入集合coll中
        coll.add(coll1);
        System.out.println(coll);//[奔驰, 宝马, 1, 2, 3, [1, 2, 3]]
        //删除指定元素
        coll.remove("宝马");
        System.out.println(coll);//[奔驰, 1, 2, 3, [1, 2, 3]]
        //查询集合中是否包含指定元素
        boolean have = coll.contains("奔驰");
        System.out.println(have);//true
        //集合判空
        boolean empty = coll.isEmpty();
        System.out.println(empty);//false
        //清空集合
//        coll.clear();
//        System.out.println(coll);//[]
        System.out.println("------集合遍历------");
        //集合遍历
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object value = iterator.next();
            System.out.println(value);
        }
        /*注意：
         * 迭代器iterator只能使用一次
         * 想再次遍历，需要再次创建迭代器
         * 同时，不能在遍历的过程中对集合进行增删改操作，因为集合不支持多线程的并发
         * */
        System.out.println("------使用原迭代器再次遍历集合------");
        //使用原迭代器再次遍历集合，不会输出任何结果
        while (iterator.hasNext()){
            Object value = iterator.next();
            System.out.println(value);
        }
    }
}
