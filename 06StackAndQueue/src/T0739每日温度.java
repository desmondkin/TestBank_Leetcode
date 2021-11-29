import java.util.ArrayDeque;
import java.util.Deque;

public class T0739每日温度 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i < n; ++i) {
            while (!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]) {
                int j = stk.pop();
                res[j] = i - j;
            }
            stk.push(i);
        }
        return res;
    }
}
