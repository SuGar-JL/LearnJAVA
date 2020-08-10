package com.sugar.list;

import java.util.LinkedList;

/**
 * @ClassName: demo_LinkedList
 * @description:
 * @author: sujiling
 * @date: 2020/7/15 12:58
 */
public class demo_LinkedList {
    public static void main(String[] args) {
        //可看作列表集合、栈和耍弄段队列
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");//结尾添加
        list.addFirst("bbb");//首部添加
        list.addLast("ccc");//结尾添加
        System.out.println(list);//[bbb, aaa, ccc]
        System.out.println("--------------------------");

        //当作集合
        String str = list.get(0);//索引获取
        System.out.println(str);//bbb
        String str1 = list.getFirst();//获取首部
        System.out.println(str1);//bbb
        String str2 = list.getLast();//获取结尾
        System.out.println(str2);//ccc
        System.out.println(list);//[bbb, aaa, ccc]
        System.out.println("--------------------------");

        //当作栈（栈顶为集合首部）
        list.push("Stack");//压栈
        System.out.println(list);//[test, bbb, aaa, ccc]
        String pop = list.pop();//出栈
        System.out.println(pop);//Stack
        System.out.println(list);//[bbb, aaa, ccc]
        String peek = list.peek();//查看栈顶（不删除）
        System.out.println(peek);//bbb
        System.out.println(list);//[bbb, aaa, ccc]
        System.out.println("--------------------------");

        //当作双端队列
        list.add("Queue");//队列尾部加数据
//        list.offer("Queue");//队列尾部加数据
        System.out.println(list);//[bbb, aaa, ccc, Queue]
        String peek1 = list.peek();//查看队列首数据
        System.out.println(peek1);//bbb
        System.out.println(list);//[bbb, aaa, ccc, Queue]
        String poll = list.poll();//出队列
        System.out.println(poll);//bbb
        System.out.println(list);//[aaa, ccc, Queue]



    }
}
