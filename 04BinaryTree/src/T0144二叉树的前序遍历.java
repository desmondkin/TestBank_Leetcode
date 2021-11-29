import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class T0144二叉树的前序遍历 {
    //递归
    public List<Integer> preorderTraversal01(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            preorder(root.left, res);
            preorder(root.right, res);
        }
    }

    //栈实现非递归
    public List<Integer> preorderTraversal02(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root != null) {
            Deque<TreeNode> s = new LinkedList<>();
            s.offerLast(root);
            while (!s.isEmpty()) {
                TreeNode node = s.pollLast();
                res.add(node.val);
                if (node.right != null) {
                    s.offerLast(node.right);
                }
                if (node.left != null) {
                    s.offerLast(node.left);
                }
            }
        }
        return res;
    }

    //Morris遍历
    public List<Integer> preorderTraversal03(TreeNode root) {
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
                    res.add(root.val);
                    pre.right = root;
                    root = root.left;
                } else {
                    pre.right = null;
                    root = root.right;
                }
            }
        }
        return res;
    }
}
