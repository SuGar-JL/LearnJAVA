package com.sugar.Thread_DeadLock;

/**
 * @ClassName: Thread_DeadLock
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 21:28
 */
class Book {
    public synchronized void tell(Painting paint){
        System.out.println("A对B说：“把你的画给我，我就给你书，不给画不给书！”");
        paint.get();
    }
    public synchronized void get(){
        System.out.println("A得到了B的画");
    }
}

class Painting {
    public synchronized void tell(Book book){
        System.out.println("B对A说：“把你的书给我，我就给你画，不给书不给画！”");
        book.get();
    }
    public synchronized void get(){
        System.out.println("B得到了A的书");
    }
}

public class DeadLock implements Runnable{

    private Book book = new Book();
    private Painting paint = new Painting();

    public DeadLock() {
        new Thread(this).start();
        book.tell(paint);
    }

    @Override
    public void run() {
        paint.tell(book);
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}



