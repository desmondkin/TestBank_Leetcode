import java.util.ArrayDeque;
import java.util.Deque;

public class T0225用队列实现栈 {
    class MyStack {

        private Deque<Integer> q;

        /** Initialize your data structure here. */
        public MyStack() {
            q = new ArrayDeque<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            q.offerLast(x);
            int n = q.size();
            while (n-- > 1) {
                q.offerLast(q.pollFirst());
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return q.pollFirst();
        }

        /** Get the top element. */
        public int top() {
            return q.peekFirst();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return q.isEmpty();
        }
    }

}
