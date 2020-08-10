import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("HelloWorld!");
        //进行字符串统计(bug:输入有空格时，空格处停止，之后的无法进行统计
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int countUpper = 0;//大写字母
        int countLower = 0;//小写字母
        int countNumber = 0;//数字
        int countOther = 0;//其它
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' < ch && ch < 'Z') {
                countUpper++;
            } else if ('a'<ch&&ch<'z') {
                countLower++;
            }else if ('0'<ch&&ch<'9'){
                countNumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母："+countUpper);
        System.out.println("小写字母："+countLower);
        System.out.println("数字："+countNumber);
        System.out.println("其它："+countOther);

    }
}
