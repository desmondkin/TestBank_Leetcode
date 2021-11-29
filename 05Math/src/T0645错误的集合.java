import java.util.Arrays;

public class T0645错误的集合 {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ret = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i + 1]){
                ret[0] = nums[i];
            }
            if(nums[i] != nums[i - 1] + 1){
                ret[1] = nums[i] - 1;
            }
        }
        return ret;
    }
}
