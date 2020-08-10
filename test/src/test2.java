/**
 * @ClassName: test2
 * @description:
 * @author: sujiling
 * @date: 2020/7/16 11:03
 */
public class test2 {
    public static void main(String[] args) {

        String str = "abc";
        String str1 = null;
        System.out.println("1、" + "abc".equals(str));//true
        System.out.println("2、" + "".equals(str));//false
        System.out.println("3、" + "abc".equals(str1));//false
        System.out.println("4、" + "".equals(str1));//false

        System.out.println("5、" + str.equals("abc"));//true
        System.out.println("6、" + str.equals(""));//false
        System.out.println("7、" + str1.equals(""));//NullPointerException
        System.out.println("8、" + str1.equals("abc"));//NullPointerException

    }
}
