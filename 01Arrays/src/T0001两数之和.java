import java.util.HashMap;
import java.util.Map;

public class T0001两数之和 {
    public static int[] twoSum01(int[] nums, int target){
        int[] ret = new int[2];
        for(int i = 0; i < nums.length; i++){
            int num2 = target - nums[i];
            for(int j = 0; j < nums.length; j++){
                if(num2 == nums[j] && j != i){
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        return ret;
    }
    //哈希表
    public static int[] twoSum02(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
