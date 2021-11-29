import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class T0503下一个更大元素Ⅱ {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i < (n << 1); ++i) {
            while (!stk.isEmpty() && nums[stk.peek()] < nums[i % n]) {
                res[stk.pop()] = nums[i % n];
            }
            stk.push(i % n);
        }
        return res;
    }
}
