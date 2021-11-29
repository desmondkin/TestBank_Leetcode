public class T0918环形子数组的最大和 {
    //对于有环最大和，我们可以转换为求最小子序和 s2，然后用 sum 减去最小子序和，得到有环的最大和
    public int maxSubarraySumCircular(int[] nums) {
        int s1 = nums[0], s2 = nums[0], f1 = nums[0], f2 = nums[0], total = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            total += nums[i];
            f1 = nums[i] + Math.max(f1, 0);
            f2 = nums[i] + Math.min(f2, 0);
            s1 = Math.max(s1, f1);
            s2 = Math.min(s2, f2);
        }
        return s1 > 0 ? Math.max(s1, total - s2) : s1;
    }
}
