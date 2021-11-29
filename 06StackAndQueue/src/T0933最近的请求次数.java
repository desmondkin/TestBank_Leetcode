import java.util.Deque;
import java.util.LinkedList;

public class T0933最近的请求次数 {
    class RecentCounter {
        private Deque<Integer> q;

        public RecentCounter() {
            q = new LinkedList<>();
        }

        public int ping(int t) {
            q.offerLast(t);
            while (q.peekFirst() < t - 3000) {
                q.pollFirst();
            }
            return q.size();
        }
    }
}
