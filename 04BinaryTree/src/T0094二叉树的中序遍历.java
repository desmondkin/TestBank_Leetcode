import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class T0094二叉树的中序遍历 {
    public List<Integer> inorderTraversal01(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if (root != null) {
            inorder(root.left, res);
            res.add(root.val);
            inorder(root.right, res);
        }
    }

    public List<Integer> inorderTraversal02(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> s = new LinkedList<>();
        while (root != null || !s.isEmpty()) {
            if (root != null) {
                s.offerLast(root);
                root = root.left;
            } else {
                root = s.pollLast();
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }

    public List<Integer> inorderTraversal03(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        while (root != null) {
            if (root.left == null) {
                res.add(root.val);
                root = root.right;
            } else {
                TreeNode pre = root.left;
                while (pre.right != null && pre.right != root) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = root;
                    root = root.left;
                } else {
                    res.add(root.val);
                    pre.right = null;
                    root = root.right;
                }
            }
        }
        return res;
    }
}
