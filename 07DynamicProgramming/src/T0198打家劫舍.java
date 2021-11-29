public class T0198打家劫舍 {
    public int rob(int[] nums) {
        int n = nums.length;
        int a = 0, b = nums[0];
        for (int i = 1; i < n; ++i) {
            int c = Math.max(nums[i] + a, b);
            a = b;
            b = c;
        }
        return b;
    }
}
