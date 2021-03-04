package daily;

public class demo32 {
    /**
     *
     * @param root TreeNode类
     * @return int整型
     */
    public int maxDepth (TreeNode root) {
        // write code here
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
