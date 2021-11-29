import java.util.HashMap;
import java.util.Map;

public class TN0105从前序与中序遍历序列构造二叉树 {
    private Map<Integer, Integer> indexes = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for (int i = 0; i < n; ++i) {
            indexes.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode build(int[] preorder, int[] inorder, int p1, int p2, int i1, int i2) {
        if (p1 > p2 || i1 > i2) return null;
        int rootVal = preorder[p1];
        int pos = indexes.get(rootVal);
        TreeNode node = new TreeNode(rootVal);
        // pos==i1，说明只有右子树，左子树为空
        node.left = pos == i1 ? null : build(preorder, inorder, p1 + 1, pos - i1 + p1, i1, pos - 1);
        // pos==i2，说明只有左子树，右子树为空
        node.right = pos == i2 ? null : build(preorder, inorder, pos - i1 + p1 + 1, p2, pos + 1, i2);
        return node;
    }
}
