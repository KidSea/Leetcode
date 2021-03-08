package daily;

/**
 * 给定一个仅包含数字\ 0-9 0−9 的二叉树，每一条从根节点到叶子节点的路径都可以用一个数字表示。
 * 例如根节点到叶子节点的一条路径是1\to 2\to 31→2→3,那么这条路径就用\ 123 123 来代替。
 * 找出根节点到叶子节点的所有路径表示的数字之和
 * 例如：
 *
 * 这颗二叉树一共有两条路径，
 * 根节点到叶子节点的路径 1\to 21→2 用数字\ 12 12 代替
 * 根节点到叶子节点的路径 1\to 31→3 用数字\ 13 13 代替
 * 所以答案为\ 12+13=25 12+13=25
 */
public class demo37 {
    /**
     *
     * @param root TreeNode类
     * @return int整型
     */

    public int sumNumbers (TreeNode root) {
        // write code here
        if(root == null) return 0;
        int sum = 0;
        return preOrder(root, sum);
    }
    int preOrder(TreeNode root, int sum) {
        if (root == null) return 0;
        sum = 10 * sum + root.val;
        if (root.left == null && root.right == null) return sum;
        return preOrder(root.left, sum) + preOrder(root.right, sum);
    }

}
