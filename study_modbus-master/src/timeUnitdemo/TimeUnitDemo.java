package timeUnitdemo;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: TimeUnitDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/22 17:31
 */
public class TimeUnitDemo {

    public static void main(String[] args) {


        TimeUnit timeUnit = TimeUnit.HOURS;
        Long days =timeUnit.convert(1L, TimeUnit.DAYS); //一天有多少小时
        timeUnit = TimeUnit.MILLISECONDS;
        Long milliSeconds = timeUnit.convert(1L, TimeUnit.DAYS); //一天有多少毫秒
        timeUnit = TimeUnit.MINUTES;
        Long minites =  timeUnit.convert(7L, TimeUnit.DAYS); //一周有多少分钟

        System.out.println(days);
        System.out.println(milliSeconds);
        System.out.println(minites);

    }
}
