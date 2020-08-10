import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

/**
 * @ClassName: DurationDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/20 13:36
 */
public class DurationDemo {

    public static void main(String[] args) {

        //Duration类表示秒或纳秒时间间隔，适合处理较短的时间，需要更高的精确性。
        //我们能使用between()方法比较两个瞬间的差：
        Instant start = Instant.parse("2017-10-03T10:15:30.00Z");
        Instant end = Instant.parse("2017-10-03T10:16:30.00Z");
        System.out.println("start：" + start + "、end：" + end);//start：2017-10-03T10:15:30Z、end：2017-10-03T10:16:30Z
        Duration duration = Duration.between(start, end);
        //那么我们能使用getSeconds() 或 getNanoseconds() 方法获取时间单元的值：
        System.out.println("时间差（s）：" + duration.getSeconds());//时间差（s）：60
        System.out.println("时间差（ns）：" + duration.getNano());//时间差（ns）：0
        //isNegative()方法能用于验证后面时间是否大于前面时间：
        System.out.println(duration.isNegative());//false（大于）
//        System.out.println(System.currentTimeMillis());

        //我们也可以通过LocalDateTime 类获取获取Duration对象：
        LocalTime start1 = LocalTime.of(1, 20, 25, 1024);
        LocalTime end1 = LocalTime.of(3, 22, 27, 1544);
        System.out.println("start1：" + start1 + "、end1：" + end1);//start1：01:20:25.000001024、end1：03:22:27.000001544
        System.out.println(Duration.between(start1, end1).getSeconds());//7322
        System.out.println(Duration.between(start1, end1).getNano());//520

        //我们能基于下面的方法获得Duration对象，ofDays(), ofHours(), ofMillis(), ofMinutes(), ofNanos(), ofSeconds():
        Duration fromDays = Duration.ofDays(1);
        System.out.println(fromDays.getSeconds());//86400
        Duration fromMinutes = Duration.ofMinutes(60);
        System.out.println(fromMinutes.getSeconds());//3600

        //当然也可以通过文本序列创建Duration对象，格式为 “PnDTnHnMn.nS”:
        Duration fromChar1 = Duration.parse("P1DT1H10M10.5S");//1天1时10分10.5秒
        System.out.println(fromChar1);//PT25H10M10.5S
        Duration fromChar2 = Duration.parse("PT10M");//10分钟
        System.out.println(fromChar2);//PT10M
        System.out.println(fromChar1.getSeconds());//90610
        System.out.println(fromChar1.getNano());//500000000（0.5秒）
        System.out.println(fromChar2.getSeconds());//600

        //可以使用toDays(), toHours(), toMillis(), toMinutes()方法把Duration对象可以转成其他时间单元：
        System.out.println(fromMinutes.toHours());//1

        //也可以通过 plusX()、minusX()方法增加或减少Duration对象，其中X表示days, hours, millis, minutes, nanos 或 seconds:
        System.out.println(duration.plusSeconds(60).getSeconds());//120
        System.out.println(duration.minusSeconds(30).getSeconds());//30
        //也可以使用plus()和minus()方法带TemporalUnit 类型参数进行加减：
//        assertEquals(120, duration.plus(60, ChronoUnit.SECONDS).getSeconds());
//        assertEquals(30, duration.minus(30, ChronoUnit.SECONDS).getSeconds());

    }
}
