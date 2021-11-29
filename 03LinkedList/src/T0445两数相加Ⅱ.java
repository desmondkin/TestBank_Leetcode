import java.util.ArrayDeque;
import java.util.Deque;

public class T0445两数相加Ⅱ {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        Deque<Integer> s1 = new ArrayDeque<>();
        Deque<Integer> s2 = new ArrayDeque<>();
        for (; l1 != null; l1 = l1.next) {
            s1.push(l1.val);
        }
        for (; l2 != null; l2 = l2.next) {
            s2.push(l2.val);
        }
        int carry = 0;
        ListNode dummy = new ListNode();
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            carry += (s1.isEmpty() ? 0 : s1.pop()) + (s2.isEmpty() ? 0 : s2.pop());
            ListNode node = new ListNode(carry % 10, dummy.next);
            dummy.next = node;
            carry /= 10;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(3, null)));
        ListNode l2 = new ListNode(9,new ListNode(8, new ListNode(7, null)));
        System.out.println(addTwoNumbers(l1, l2));
    }
}
