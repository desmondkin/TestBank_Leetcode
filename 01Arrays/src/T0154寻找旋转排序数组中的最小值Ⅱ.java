public class T0154寻找旋转排序数组中的最小值Ⅱ {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (nums[m] > nums[r]) l = m + 1;
            else if (nums[m] < nums[r]) r = m;
            else --r;
        }
        return nums[l];
    }
}
