package t05;

/**
 * @ClassName: t05.Ti05
 * @description:
 * @author: sujiling
 * @date: 2020/7/31 21:45
 */
public class Ti05 {
    public static void main(String[] args) {
//        String s = "cbbd";
        String s = "\"\"";
        String s1 = longestPalindrome(s);
        System.out.println(s1);
    }
    //1.暴力匹配
    private static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        // s.charAt(i) 每次都会检查数组下标越界，因此先转换成字符数组
        char[] charArray = s.toCharArray();

        // 枚举所有长度大于 1 的子串 charArray[i..j]
        //取到一个字串然后再拿去判断是不是回问字串
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && validPalindromic(charArray, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    /**
     * 验证子串 s[left..right] 是否为回文串
     */
    private static boolean validPalindromic(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
