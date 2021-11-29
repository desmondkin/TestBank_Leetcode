public class M0026树的子结构 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null || A == null) return false;
        if (A.val != B.val) return isSubStructure(A.left, B) || isSubStructure(A.right, B);
        return sub(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean sub(TreeNode A, TreeNode B) {
        // 判断从当前A节点开始，是否包含B
        if (B == null) return true;
        if (A == null) return false;
        return A.val == B.val && sub(A.left, B.left) && sub(A.right, B.right);
    }
}
