public class BinarySearch {
    private static int binarySearch(int[] A, int target){
        int low = 0, high = A.length, mid;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(A[mid] == target){
                return mid;
            }else if(A[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(nums, 4));
    }
}
