package com.sugar;

/**
 * @ClassName: Thread_Join
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 17:06
 */
public class Thread_Join {

    public static void main(String[] args) throws InterruptedException {

        /*
        * 使用线程强制执行，强制让主线程执行，子线程等主线程执行完才执行
        * */
        Thread mainThread = Thread.currentThread();//获得主线程
        Thread thread = new Thread(() -> {
            for (int x = 0; x < 100; x++) {
                if (x == 3){
                    try {
                        mainThread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "执行、x = " + x);
            }
        }, "玩耍的线程");
        thread.start();//启动子线程

        //主线程任务
        for (int x = 0; x < 100; x++) {
            Thread.sleep(100);
            System.out.println("主线程任务执行、x = " + x);
        }
    }
}
