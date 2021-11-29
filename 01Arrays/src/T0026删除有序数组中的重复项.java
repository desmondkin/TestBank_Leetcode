public class T0026删除有序数组中的重复项 {
    public int removeDuplicates01(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i + 1]){
                count ++;
                for(int j = i + 1; j < nums.length - count; j++){
                    nums[j] = nums[j + count];
                }
            }
        }
        return nums.length - count;
    }

    //双指针
    public int removeDuplicates02(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int fast = 1;
        int slow = 1;
        while(fast < nums.length){
            if(nums[fast] != nums[fast -1]){
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
