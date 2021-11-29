public class T0153寻找旋转排序数组中的最小值 {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        // 说明是递增顺序，直接返回第一个元素
        if (nums[l] < nums[r]) return nums[0];
        while (l < r) {
            int m = (l + r) >>> 1;
            if (nums[m] > nums[r]) l = m + 1;
            else r = m;
        }
        return nums[l];
    }
}
