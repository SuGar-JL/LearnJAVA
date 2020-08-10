package demo01;

/**
 * @ClassName: Demo01Main
 * @description: 将已排序数组[-10,-3,0,5,9]
 * @author: sujiling
 * @date: 2020/7/3 18:43
 */
public class Demo01Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(90);
        Solution solution = new Solution();
        int[] nums = {-10,-3,0,5,9};
        treeNode = solution.sortedArrayToBST(nums);
        System.out.println(treeNode.val);
        System.out.println(treeNode.left.val);
        System.out.println(treeNode.right.val);
        System.out.println(treeNode.left.right.val);
        System.out.println(treeNode.right.right.val);

    }
}
