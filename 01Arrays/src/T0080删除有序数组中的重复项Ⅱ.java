public class T0080删除有序数组中的重复项Ⅱ {
    public int removeDuplicates(int[] nums){
        int flag = 0;
        int ff = 0;
        int[] ret = new int[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                flag ++;
            }else{
                flag = 0;
            }
            if(flag < 2){
                ret[ff] = nums[i];
                ff ++;
            }
        }
        return ff;
    }
}
