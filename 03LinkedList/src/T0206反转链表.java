public class T0206反转链表 {
    public ListNode reverseList01(ListNode head) {
        ListNode pre = null, p = head;
        while (p != null) {
            ListNode q = p.next;
            p.next = pre;
            pre = p;
            p = q;
        }
        return pre;
    }

    public static ListNode reverseList02(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = reverseList02(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4, null))));
        System.out.println(reverseList02(l1));
    }
}
