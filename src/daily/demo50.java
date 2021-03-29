package daily;
/*
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class demo50 {
    TreeNode lastNodeList = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrderConvert(pRootOfTree);
        //寻找链表头节点
        while (lastNodeList != null && lastNodeList.left != null)
            lastNodeList = lastNodeList.left;
        return lastNodeList;
    }

    public void inOrderConvert(TreeNode root) {
        if (root == null)
            return;
        if (root != null) {
            inOrderConvert(root.left);
            root.left = lastNodeList;
            if (lastNodeList != null)
                lastNodeList.right = root;
            lastNodeList = root;
            inOrderConvert(root.right);
        }
    }
}
