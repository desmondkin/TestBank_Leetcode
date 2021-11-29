public class T0169多数元素 {
    public int majorityElement(int[] nums){
        int flag = 0;
        int major = nums[0];

        for(int num : nums){
            if(flag == 0){
                flag ++;
                major = num;
            }else{
                flag += (major == num ? 1 : -1);
            }
        }
        return major;
    }
}
