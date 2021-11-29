public class T0027移除元素 {
    public int removeElement01(int[] nums, int val){
        int p = 0;
        for(int q = 0; q < nums.length; q++){
            if(nums[q] != val){
                nums[p] = nums[q];
                p++;
            }
        }
        return p;
    }
}
