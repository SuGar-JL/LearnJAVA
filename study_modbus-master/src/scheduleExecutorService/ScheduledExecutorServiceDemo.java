package scheduleExecutorService;

/**
 * @ClassName: scheduleExecutorService.ScheduledExecutorServiceDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/20 15:23
 */
public class ScheduledExecutorServiceDemo {

    public static void main(String[] args) throws Exception {

        Test test = new Test();
        //1.schedule Runnable
        System.out.println("1-----------------");
        test.test_schedule4Runnable();
        //2.schedule Callable
        System.out.println("2-----------------");
        test.test_schedule4Callable();
        //3. scheduleAtFixedRate
        System.out.println("3-----------------");
        test.test_scheduleAtFixedRate();
        //4.scheduleWithFixedDelay
        System.out.println("4-----------------");
        test.test_scheduleWithFixedDelay();

    }
}
