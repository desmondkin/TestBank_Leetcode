import java.util.ArrayDeque;
import java.util.Deque;

public class M0059队列的最大值 {
    class MaxQueue {
        private Deque<Integer> p;
        private Deque<Integer> q;

        public MaxQueue() {
            p = new ArrayDeque<>();
            q = new ArrayDeque<>();
        }

        private int max_value() {
            return q.isEmpty() ? -1 : q.peekFirst();
        }

        private void push_back(int value) {
            while (!q.isEmpty() && q.peekLast() < value) {
                q.pollLast();
            }
            p.offerLast(value);
            q.offerLast(value);
        }

        public int pop_front() {
            if(p.isEmpty()) return -1;
            int res = p.pollFirst();
            if(q.peek() == res) q.pollFirst();
            return res;
        }
    }
}
