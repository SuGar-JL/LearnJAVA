package t04;

/**
 * @ClassName: t04.Ti04
 * @description:
 * @author: sujiling
 * @date: 2020/7/29 23:47
 */
public class Ti04 {
    /*
    * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
    * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
    * 你可以假设 nums1 和 nums2 不会同时为空。
    * 示例 1:
    * nums1 = [1, 3]
    * nums2 = [2]
    * 则中位数是 2.0
    * 示例 2:
    * nums1 = [1, 2]
    * nums2 = [3, 4]
    * 则中位数是 (2 + 3)/2 = 2.5
    * */
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
//        System.out.println(nums1);
        int[] nums2 = {3, 4};
        //1 2 3 4
        //1 2 2 4
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println("结果：" + result);
    }

    //方法一:不组合数组，直接找中位数，时间复杂度是O(m+n)
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        double temp = 0;
        int index1 = 0;
        int index2 = 0;
        //1.数组总长为奇数
        if ((len1 + len2) % 2 != 0) {
            for (int i = 0; i < (len1 + len2) / 2 + 1; i++) {
                if ((index1 > len1 - 1 && index2 <= len2 - 1) || nums1.length == 0) {
                    temp = nums2[index2];
                    index2++;
                } else if ((index2 > len2 - 1 && index1 <= len1 - 1) || nums2.length == 0) {
                    temp = nums1[index1];
                    index1++;
                } else {
                    if (nums1[index1] < nums2[index2]) {
                        temp = nums1[index1];
                        index1++;
                    } else if (nums1[index1] == nums2[index2]) {
                        temp = nums2[index2];
                        index2++;
                    } else {
                        temp = nums2[index2];
                        index2++;
                    }
                }
            }
            return temp;
        } else {
            int left = 0;
            int right = 0;
            for (int i = 0; i < (len1 + len2) / 2 + 1; i++) {
                if ((index1 > len1 - 1 && index2 <= len2 - 1) || nums1.length == 0) {
                    left = right;
                    right = nums2[index2];
                    index2++;
                } else if ((index2 > len2 - 1 && index1 <= len1 - 1) || nums2.length == 0) {
                    left = right;
                    right = nums1[index1];
                    index1++;
                } else {
                    if (nums1[index1] < nums2[index2]) {
                        left = right;
                        right = nums1[index1];
                        index1++;
                    } else if (nums1[index1] == nums2[index2]) {
                        left = right;
                        right = nums2[index2];
                        index2++;
                    } else {
                        left = right;
                        right = nums2[index2];
                        index2++;
                    }
                }
            }
            temp = (left + right) / 2.0;
            System.out.println(left + "--" + right);
            return temp;
        }
    }
    //方法二：二分查找
    //方法三：
}
