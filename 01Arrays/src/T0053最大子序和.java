public class T0053最大子序和 {
    public int maxSubArray01(int[] nums){
        int[] a = new int[nums.length];
        int[] b = new int[nums.length];
        int max = 0;
        a[0] = nums[0];
        b[0] = nums[0];
        for(int j = 1; j < nums.length; j++){
            for(int i = j; i < nums.length; i++){
                a[i] = a[i-1] + nums[i];
                b[j] = Math.max(a[i], a[i-1]);
            }
            max = Math.max(b[j], b[j-1]);
        }
        return max;
    }

    //动态规划
    public int maxSubArray02(int[] nums){
        int pre = 0;
        int res = nums[0];
        for(int num : nums){
            pre = Math.max(pre + num, num);
            res = Math.max(res, pre);
        }
        return res;
    }
}

