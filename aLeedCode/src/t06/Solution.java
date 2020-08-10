package t06;

import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName: Solution
 * @description:
 * @author: sujiling
 * @date: 2020/8/5 22:59
 */
public class Solution {

    public static void main(String[] args) {

        //放弃了，有错，还复杂，用题解吧
        String s = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.";
        int numRows = 55;
        String str = convert(s, numRows);
        System.out.println(str);
    }

    public static String convert(String s, int numRows) {

        StringBuilder sb = new StringBuilder();
        HashMap<String, Character> map = new HashMap<>();
        int row = 0;//记录行号
        int column = 0;//记录列号
        int x = 2 * numRows - 2;
        if (numRows == 1) {
            return s;
        }
        if (numRows == 2) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (i == 0) {
                        if (j%2 == 0) {
                            sb.append(s.charAt(j));
                        }
                    } else {
                        if (j%2 == 1) {
                            sb.append(s.charAt(j));
                        }
                    }
                }
            }
            return sb.toString();
        }
        for (int i = 0; i < s.length(); i++) {
            if (row <= x) {
                if (row < numRows) {
                    String r_c = "" + row + column;
                    map.put(r_c, s.charAt(i));
                    row++;
                } else {
                    column++;
                    int  y = 2 * numRows - row - 2;
                    String r_c = "" + y + column;
                    map.put(r_c, s.charAt(i));
                    row++;
                    if (row == x) {
                        row = 0;
                        column++;
                    }
                }
            }
        }

        System.out.println(map);
        Set<String> keys = map.keySet();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= column; j++) {
                String r_c = "" + i + j;
                if (keys.contains(r_c)) {
                    for (String key : keys) {
                        if (key.equals(r_c)) {
                            sb.append(map.get(key));
                            keys.remove(key);
                            break;
                        }
                    }
                }
            }
        }

        return sb.toString();
    }
}
