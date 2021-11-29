import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class T0145二叉树的后序遍历 {
    //递归
    public List<Integer> postorderTraversal01(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

    private void postorder(TreeNode root, List<Integer> res) {
        if (root != null) {
            postorder(root.left, res);
            postorder(root.right, res);
            res.add(root.val);
        }
    }

    //栈实现
    public List<Integer> postorderTraversal02(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root != null) {
            Deque<TreeNode> s = new LinkedList<>();
            s.offerLast(root);
            while (!s.isEmpty()) {
                TreeNode node = s.pollLast();
                res.addFirst(node.val);
                if (node.left != null) {
                    s.offerLast(node.left);
                }
                if (node.right != null) {
                    s.offerLast(node.right);
                }
            }
        }
        return res;
    }

    //Morris遍历
    public List<Integer> postorderTraversal03(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        while (root != null) {
            if (root.right == null) {
                res.addFirst(root.val);
                root = root.left;
            } else {
                TreeNode next = root.right;
                while (next.left != null && next.left != root) {
                    next = next.left;
                }
                if (next.left == null) {
                    res.addFirst(root.val);
                    next.left = root;
                    root = root.right;
                } else {
                    next.left = null;
                    root = root.left;
                }
            }
        }
        return res;
    }
}
