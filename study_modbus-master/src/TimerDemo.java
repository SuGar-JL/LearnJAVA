import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName: TimerDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/20 14:29
 */
public class TimerDemo {
    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {//与Thread好像
            @Override
            public void run() {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                System.out.println(format.format(scheduledExecutionTime()) + ", called");
            }
        };
//        System.out.println(new SimpleDateFormat("HH:mm:ss").format(scheduledExecutionTime()));//
        //一次性调度
        // 延迟一秒打印
        System.out.println("当前时间："+new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()));
        timer.schedule(task, 1000);

        TimerTask task1 = new TimerTask() {//与Thread好像，实际实现了Runnable接口
            @Override
            public void run() {
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                System.out.println(format.format(scheduledExecutionTime()) + ", called");
            }
        };
        //循环调度
        // 固定时间的调度方式，延迟一秒，之后每隔一秒打印一次
//        timer.schedule(task1, 1000, 1000);//第二个参数delay是延迟时间，第三个参数是执行时间间隔，设为2就表示2s打印一次
        //或用下面这句
//        timer.scheduleAtFixedRate(task1, 1000, 1000);

        /*
        * schedule与scheduleAtFixedRate的区别：
        * 在正常的情况下，他们的效果是一模一样的。而在异常的情况下————任务执行的时间比间隔的时间更长，他们是效果是不一样的。
        * 1.schedule()方法，任务的下一次执行时间是相对于上一次实际【执行完成】的时间点 ，因此执行时间【会】不断延后。
        * 2.scheduleAtFixedRate()方法，任务的下一次执行时间是相对于上一次【开始执行】的时间点 ，因此执行时间【不会】延后。
        * 3.由于Timer内部是通过【单线程】方式实现的，所以这两种方式都【不存在线程安全的问题】。
        * */
        //当任务执行的时间比间隔的时间更长
        TimerTask task2 = new TimerTask() {//与Thread好像
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);//设执行时间为3s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                System.out.println(format.format(scheduledExecutionTime()) + ", called");
            }
        };
//        timer.schedule(task2, 1000, 1000);//打印出来间隔3秒
        timer.scheduleAtFixedRate(task2, 1000, 1000);//打印出来还是间隔1秒


    }
}
