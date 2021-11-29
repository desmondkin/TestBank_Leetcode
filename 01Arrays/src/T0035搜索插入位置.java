public class T0035搜索插入位置 {
    public int searchInsert01(int[] nums, int target){
        int ret = 0;
        for(int i = 0; i < nums.length; i++){
            if(target > nums[i] && target < nums[i+1]){
                ret = i;
            }
        }
        return ret;
    }

    //二分法查找
    public int searchInsert02(int[] nums, int target){

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int mid = (left + right)/2;

        while(nums[left] < target && target < nums[right]){
            if(target == nums[mid]){
                return mid;
            }else if(nums[mid] > target){
                right = mid;
            }else{
                left = mid;
            }
        }
        return mid;
    }
}
