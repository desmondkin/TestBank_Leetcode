import java.util.ArrayDeque;
import java.util.Deque;

public class T0232用栈实现队列 {
    class MyQueue {

        private Deque<Integer> s1 = new ArrayDeque<>();
        private Deque<Integer> s2 = new ArrayDeque<>();

        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            s1.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            move();
            return s2.pop();
        }

        /** Get the front element. */
        public int peek() {
            move();
            return s2.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        /** Move elements from s1 to s2. */
        private void move() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
        }
    }
}
