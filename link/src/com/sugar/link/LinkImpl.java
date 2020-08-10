package com.sugar.link;

/**
 * @ClassName: LinkImpl
 * @description: 链表的实现类
 * @author: sujiling
 * @date: 2020/7/13 14:38
 */
public class LinkImpl<E> implements ILink<E> {

    private Node<E> root;//链表实现类中要存储根节点
    private int count;//链表元素个数计数器
    private int foot;//数组操作脚标
    private Object[] returnData;

    //增加节点（数据）
    @Override
    public void add(E e) {
        if (e == null) {
            return;
        }
        Node<E> newNode = new Node<E>(e);
        //先看根节点是否为空，空则给根节点赋值
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }

        //计数器+1
        this.count++;
    }

    //获取链表元素个数
    @Override
    public int size() {
        return this.count;
    }

    //链表判空
    @Override
    public boolean isEmpty() {
//        if (this.root = null){
//            return true;
//        }
        return this.count == 0;
    }

    //链表转数组
    @Override
    public Object[] toArray() {
        if (this.isEmpty()) {
            throw new NullPointerException("链表为空！");
        }
        this.foot = 0;
        this.returnData = new Object[this.count];//开辟数组空间
        this.root.toArrayNode();
        return returnData;
    }

    //通过索引获取数据
    @Override
    public E get(int index) {
        if (index >= this.count) {
            throw new ArrayIndexOutOfBoundsException("不正确的数据索引");
        }
        this.foot = 0;
        return this.root.getNode(index);
    }

    //根据索引修改链表数据
    @Override
    public void set(int index, E data) {
        if (index >= this.count) {
            throw new ArrayIndexOutOfBoundsException("不正确的数据索引！");
        }
        this.foot = 0;
        this.root.setNode(index, data);
    }

    //查询链表是否含有某数据
    @Override
    public boolean contains(E data) {
        if (data != null) {
            return this.root.containsNode(data);
        } else {
            return false;
        }
    }

    //删除链表数据
    @Override
    public void remove(E data) {
        if (this.contains(data)) {

            if (this.root.data.equals(data)) {//删除根节点
                this.root = this.root.next;
            } else {//删除子节点
                this.root.next.removeNode(this.root, data);
            }

            this.count--;//删除成功，链表长度减一
        }
    }

    //清空链表
    @Override
    public void clean() {
        this.root = null;
        this.count = 0;
    }

    //使用内部类定义链表节点
    private class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }

        //description: 链表节点增加方法，此方法有Node类的对象调用
        public void addNode(Node<E> newNode) {
            //判断当前节点的next是否为空，空则插入新节点
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode);//递归调用，直到找到next为空的节点
            }
        }

        //开辟数组，将链表元素存入数组，方便外部获取链表数据
        public void toArrayNode() {
            LinkImpl.this.returnData[LinkImpl.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }

        //通过索引获取数据
        public E getNode(int index) {
            if (LinkImpl.this.foot++ == index) {
                return this.data;
            } else {
                return this.next.getNode(index);
            }
        }

        //根据索引修改节点数据
        public void setNode(int index, E data) {
            if (LinkImpl.this.foot++ == index) {
                this.data = data;
            } else {
                this.next.setNode(index, data);
            }
        }

        //查询是否存在含有某数据的节点
        public boolean containsNode(E data) {
            if (this.data.equals(data)) {
                return true;
            } else {
                if (this.next == null) {
                    return false;
                } else {
                    return this.next.containsNode(data);
                }
            }
        }

        //删除子节点
        public void removeNode(Node previous, E data) {
            if (this.data.equals(data)) {
                previous.next = this.next;
            } else {
                if (this.next == null) {
                    return;
                } else {
                    this.next.removeNode(this, data);
                }
            }
        }

    }
}
