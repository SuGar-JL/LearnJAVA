package t03;

import java.util.HashSet;

/**
 * @ClassName: t03.Ti03
 * @description:
 * @author: sujiling
 * @date: 2020/7/27 23:15
 */
public class Ti03 {
    /*给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

    示例 1:

    输入: "abcabcbb"
    输出: 3
    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
    示例 2:

    输入: "bbbbb"
    输出: 1
    解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
    示例 3:

    输入: "pwwkew"
    输出: 3
    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
                 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

    来源：力扣（LeetCode）*/

    public static void main(String[] args) {
        System.out.println("maxLen: " + lengthOfLongestSubstring("1233454566"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        //从头检测，直到遇到相同字符出现，记下当前长度，
        // 再上次检测开始处的下一个字符开始进行检测
        //获取字符串长度
        int len = s.length();
        //最大长度
        int maxLen = 0;
        //用集合来存当前检测的无重复字符的序列
        //用HashSet性能高
        HashSet<Character> sList = new HashSet<>();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                //取单个字符
                char tempChar = s.charAt(j);
                System.out.println("取到：" + tempChar);
                //如果当前序列没有，则添加
                if (!sList.contains(tempChar)) {
                    sList.add(tempChar);
                    System.out.println("存入：" + tempChar);
                } else {
                    break;
                }
            }
            //发现重复，暂停检测，更改最大长度，并清空集合，
            // 从i+1处开始检测
            if (maxLen < sList.size()){
                maxLen = sList.size();
            }
            System.out.println("当前maxLen：" + maxLen);
            sList.clear();
        }
        return maxLen;
    }
}
