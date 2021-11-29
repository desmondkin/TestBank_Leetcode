import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class T0173二叉搜索树迭代器 {
    //递归
    class BSTIterator01 {
        private int cur = 0;
        private List<Integer> vals = new ArrayList<>();

        public BSTIterator01(TreeNode root) {
            inorder(root);
        }

        public int next() {
            return vals.get(cur++);
        }

        public boolean hasNext() {
            return cur < vals.size();
        }

        private void inorder(TreeNode root) {
            if (root != null) {
                inorder(root.left);
                vals.add(root.val);
                inorder(root.right);
            }
        }
    }

    //栈迭代
    class BSTIterator02 {
        private Deque<TreeNode> stack = new LinkedList<>();

        public BSTIterator02(TreeNode root) {
            for (; root != null; root = root.left) {
                stack.offerLast(root);
            }
        }

        public int next() {
            TreeNode cur = stack.pollLast();
            for (TreeNode node = cur.right; node != null; node = node.left) {
                stack.offerLast(node);
            }
            return cur.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }
}
