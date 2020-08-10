package collections.com.sugar.custom_object_sort;

import java.util.Comparator;

/**
 * @ClassName: Stu_Comparator
 * @description: 用外部比较器实现自定义对象的比较，然后实现集合的排序
 * @author: sujiling
 * @date: 2020/7/15 14:17
 */
public class Stu_Comparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getStuNo() > o2.getStuNo()) {
            return 1;
        } else if (o1.getStuNo() < o2.getStuNo()) {
            return -1;
        }else{
            return o1.getName().compareTo(o2.getName());
        }

    }
}
