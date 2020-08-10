package collections.com.sugar.custom_object_sort;

/**
 * @ClassName: Student
 * @description:
 * @author: sujiling
 * @date: 2020/7/15 14:11
 */
public class Student {
    private String name;
    private int stuNo;

    public Student(String name, int stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNo=" + stuNo +
                '}';
    }
}
