package com.sugar.link;

/**
 * @ClassName: ILink
 * @description: 此为链表的实现标准
 * @author: sujiling
 * @date: 2020/7/13 14:37
 */
public interface ILink<E> {

    //链表数据添加
    public void add(E e);

    //获取链表的长度（元素个数）
    public int size();

    //链表判空方法
    public boolean isEmpty();

    //将链表数据转为数组返回
    public Object[] toArray();

    //通过索引获取链表数据
    public E get(int index);

    //根据索引修改链表数据
    public void  set(int index, E data);

    //链表数据查询（是否含有某数据）
    public boolean contains(E data);

    //删除链表数据
    public void remove(E data);

    //清空链表
    public void clean();
}
