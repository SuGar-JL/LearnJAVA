package demo01;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: Calendar_demo  设置/获取日期
 * @description:
 * @author: sujiling
 * @date: 2020/7/4 20:26
 */
public class Calendar_demo {
    public static void main(String[] args) {
        //创建（实际为获取）Calendar日历：Calendar类的getInstance方法
        Calendar calendar = Calendar.getInstance();
        //直接打印日历对象，Calendar类重写了Object的toString()方法
        System.out.println(calendar);
        /*获取日历信息，get方法*/
        //获取年
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);//2020
        //获取月
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);//6这是西方的表示方法（0~11），实际为7月
        //获取日
//        int date = calendar.get(Calendar.DATE);
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);//4
        //另外还可以获取时、分、秒，方法相同……
        System.out.println("-----------");
        /*ste方法*/
        //设置年为9999年，其它的类似
        calendar.set(Calendar.YEAR,9999);
        int year1 = calendar.get(Calendar.YEAR);
        System.out.println(year1);
        /*add方法*/
        //当前年加上2年
        calendar.add(Calendar.YEAR,2);
        int year2 = calendar.get(Calendar.YEAR);
        System.out.println(year2);
        /*getTIme方法：将日历对象转换为Date对象*/
        Date d = calendar.getTime();
        System.out.println(d);
    }
}
