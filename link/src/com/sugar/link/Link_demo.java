package com.sugar.link;

/**
 * @ClassName: Link_demo
 * @description:
 * @author: sujiling
 * @date: 2020/7/13 14:36
 */
public class Link_demo {

    public static void main(String[] args) {

        ILink<String> link = new LinkImpl<>();
        //链表判空
        System.out.println("link是否为空：" + link.isEmpty());
        link.add("aaa");
        link.add("bbb");
        link.add("ccc");

        //获取链表元素个数
        int size = link.size();
        System.out.println("link的长度：" + size);//link的长度：3

        //链表判空
        System.out.println("link是否为空：" + link.isEmpty());

        //链表转数组获取数据
        Object[] array = link.toArray();
        System.out.print("link转数组获取所有数据：");
        for (Object o : array) {
            String str = (String) o;
//            System.out.print(o + "、");//link转数组获取所有数据：aaa、bbb、ccc、
            System.out.print(str + "、");//link转数组获取所有数据：aaa、bbb、ccc、
        }
        System.out.println("");//换行

        //根据索引获取链表数据
        String str = link.get(1);
        System.out.println("link索引为1的数据：" + str);//link索引为1的数据：bbb

        //根据索引修改链表数据
        link.set(1, "ddd");
        //链表转数组获取数据
        Object[] array1 = link.toArray();
        System.out.print("link转数组获取所有数据：");
        for (Object o : array1) {
            String str1 = (String) o;
            System.out.print(str1 + "、");//link转数组获取所有数据：aaa、ddd、ccc、
        }
        System.out.println("");//换行

        //查询链表是否含有某数据，如果链表保存的是自定义对象，则自定义对象要覆写equals方法
        System.out.println("link是否含有ddd:" + link.contains("ddd"));//true
        System.out.println("link是否含有bbb:" + link.contains("bbb"));//false

        //删除链表数据
        //1.删除子节点
        link.remove("ccc");
        //链表转数组获取数据
        Object[] array2 = link.toArray();
        System.out.print("link转数组获取所有数据：");
        for (Object o : array2) {
            String str2 = (String) o;
            System.out.print(str2 + "、");//link转数组获取所有数据：aaa、ddd、
        }
        System.out.println("");//换行
        //2.删除根节点
        link.remove("aaa");
        //链表转数组获取数据
        Object[] array3 = link.toArray();
        System.out.print("link转数组获取所有数据：");
        for (Object o : array3) {
            String str3 = (String) o;
            System.out.print(str3 + "、");//link转数组获取所有数据：ddd、
        }
        System.out.println("");//换行

        //清空链表
        link.clean();
        //链表转数组获取数据
        Object[] array4 = link.toArray();
        System.out.print("link转数组获取所有数据：");
        for (Object o : array4) {
            String str2 = (String) o;
            System.out.print(str2 + "、");//Exception in thread "main" java.lang.NullPointerException: 链表为空！
        }
        System.out.println("");//换行
    }
}
