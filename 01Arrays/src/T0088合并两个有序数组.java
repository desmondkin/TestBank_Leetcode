import java.util.Arrays;

public class T0088合并两个有序数组 {
    public void merge01(int[] nums1, int m, int[] nums2, int n){
        int p = 0, q = 0;
        int[] nums = new int[m + n];
        for(int i = 0; i < m + n; i++){
            if(nums1[p] <= nums2[q]){
                nums[p + q] = nums1[p];
            }else if(nums1[p] > nums2[q]){
                nums[p + q] = nums2[q];
            }
        }
        nums1 = nums;
    }

    public void merge02(int[] nums1, int m, int[] nums2, int n){
        for(int i = 0; i != n; ++i){
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
