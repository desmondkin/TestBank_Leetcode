public class T0268丢失的数字 {
    public int missingNumber01(int[] nums) {
        int res = nums.length;
        for (int i = 0, n = res; i < n; ++i) {
            res ^= (i ^ nums[i]);
        }
        return res;
    }

    public int missingNumber02(int[] nums) {
        int res = nums.length;
        for (int i = 0, n = res; i < n; ++i) {
            res += (i - nums[i]);
        }
        return res;
    }
}
