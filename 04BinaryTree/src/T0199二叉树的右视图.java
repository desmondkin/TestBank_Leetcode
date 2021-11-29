import java.util.*;

public class T0199二叉树的右视图 {
    public List<Integer> rightSideView01(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            ans.add(q.peekFirst().val);
            for (int i = q.size(); i > 0; --i) {
                TreeNode node = q.poll();
                if (node.right != null) {
                    q.offer(node.right);
                }
                if (node.left != null) {
                    q.offer(node.left);
                }
            }
        }
        return ans;
    }

    //每层找到最右节点并记录
    public List<Integer> rightSideView02(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        while(root.left != null || root.right != null) {
            ans.add(root.val);
            if(root.right != null){
                root = root.right;
            }else{
                root = root.left;
            }
        }
        ans.add(root.val);

        return ans;
    }
}
