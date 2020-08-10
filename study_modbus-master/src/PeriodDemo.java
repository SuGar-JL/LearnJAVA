import java.time.LocalDate;
import java.time.Period;

/**
 * @ClassName: PeriodDemo
 * @description:
 * @author: sujiling
 * @date: 2020/7/20 13:07
 */
public class PeriodDemo {

    public static void main(String[] args) {

        //Period 类表示一段时间的年、月、日，使用between()方法获取两个日期之间的差作为Period 对象返回
        LocalDate startDate = LocalDate.of(2020,7,1);
        LocalDate endDate = LocalDate.of(2021,8,2);

        Period period = Period.between(startDate,endDate);
        System.out.println(period);//P1Y1M1D（表示时间差为一年一月一日）
        System.out.println("年差："+period.getYears()+"、月差："+period.getMonths()+"、日差："+period.getDays());//年差：1、月差：1、日差：1

        //判断endDate是否晚于startDate
        //当有时间单元（年、月或日的差）都是数，则返回false，那么startDate早于endDate
        System.out.println(period.isNegative());//false

        //创建Period类型对象是基于年、月、日和周，通过下面方法：
        Period fromUnits = Period.of(3, 10, 10);
        System.out.println("年差："+fromUnits.getYears()+"、月差："+fromUnits.getMonths()+"、日差："+fromUnits.getDays());//年差：3、月差：10、日差：10

        Period fromDays = Period.ofDays(50);
        System.out.println("年差："+fromDays.getYears()+"、月差："+fromDays.getMonths()+"、日差："+fromDays.getDays());//年差：0、月差：0、日差：50
        Period fromMonths = Period.ofMonths(5);
        System.out.println("年差："+fromMonths.getYears()+"、月差："+fromMonths.getMonths()+"、日差："+fromMonths.getDays());//年差：0、月差：5、日差：0
        Period fromYears = Period.ofYears(10);
        System.out.println("年差："+fromYears.getYears()+"、月差："+fromYears.getMonths()+"、日差："+fromYears.getDays());//年差：10、月差：0、日差：0
        Period fromWeeks = Period.ofWeeks(40);//40周=280天
        System.out.println("年差："+fromWeeks.getYears()+"、月差："+fromWeeks.getMonths()+"、日差："+fromWeeks.getDays());//年差：0、月差：0、日差：280

        //我们也可以通过解析文本序列来创建Period，其格式为“PnYnMnD”:
        Period fromCharYears = Period.parse("P2Y");
        System.out.println("年差："+fromCharYears.getYears()+"、月差："+fromCharYears.getMonths()+"、日差："+fromCharYears.getDays());//年差：2、月差：0、日差：0
        Period fromCharUnits = Period.parse("P2Y3M5D");
        System.out.println("年差："+fromCharUnits.getYears()+"、月差："+fromCharUnits.getMonths()+"、日差："+fromCharUnits.getDays());//年差：2、月差：3、日差：5
        //period的值可以通过plusX()、minusX()方法进行增加或减少，其中X表示日期单元：
        System.out.println(fromCharUnits.plusDays(10).getDays());//15
        System.out.println(fromCharUnits.minusMonths(1).getMonths());//2
    }
}
