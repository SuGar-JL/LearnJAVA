package scheduleExecutorService;

import java.text.SimpleDateFormat;
import java.util.concurrent.*;

/**
 * @ClassName: Test
 * @description:
 * @author: sujiling
 * @date: 2020/7/20 15:38
 */
public class Test {

    /**
     * 带延迟时间的调度，【只执行一次】
     * 调度之后可通过Future.get()阻塞直至任务执行完毕
     * 1. public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit);
     */
    public void test_schedule4Runnable() throws Exception {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();//单线程
        ScheduledFuture future = service.schedule(() -> {//重写Runnable接口的run方法
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task finish time: " + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(System.currentTimeMillis()));
        }, 1000, TimeUnit.MILLISECONDS);
        System.out.println("schedule finish time: " + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(System.currentTimeMillis()));
        //通过future.get()阻塞直到任务执行结束，没有调用时，上面的时间差为3s，调用后为4s
        System.out.println("Runnable future's result is: " + future.get() +
                ", and time is: " + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(System.currentTimeMillis()));
    }

    /**
     * 带延迟时间的调度，【只执行一次】
     * 调度之后可通过Future.get()阻塞直至任务执行完毕，【并且可以获取执行结果】
     * 2. public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit);
     */
    public void test_schedule4Callable() throws Exception {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();//单线程
        ScheduledFuture<String> future = service.schedule(() -> {//重写Callable接口的run方法
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task finish time: " + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(System.currentTimeMillis()));
            return "success";//有返回值
        }, 1000, TimeUnit.MILLISECONDS);
        System.out.println("schedule finish time: " + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(System.currentTimeMillis()));

        System.out.println("Callable future's result is: " + future.get() +
                ", and time is: " + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(System.currentTimeMillis()));
    }

    /**
     * 带延迟时间的调度，【循环执行，固定频率】
     * 3. public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);
     */
    public void test_scheduleAtFixedRate() {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);//5个线程池
        service.scheduleAtFixedRate(() -> {//重写Runnable接口的run方法
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("3---" + Thread.currentThread().getName() + " task finish time: " + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(System.currentTimeMillis()));
        }, 1000L, 1000L, TimeUnit.MILLISECONDS);

        System.out.println("schedule finish time: " + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(System.currentTimeMillis()));

    }

    /**
     * 带延迟时间的调度，【循环执行，固定延迟】
     * 4. public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit);
     */
    public void test_scheduleWithFixedDelay() {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);//5个线程池
        service.scheduleWithFixedDelay(() -> {//重写Runnable接口的run方法
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("4---" + Thread.currentThread().getName() + " task finish time: " + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(System.currentTimeMillis()));
        }, 1000L, 1000L, TimeUnit.MILLISECONDS);

        System.out.println("schedule finish time: " + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(System.currentTimeMillis()));

    }
}
