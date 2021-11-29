public class T0160相交链表 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cur1 = headA, cur2 = headB;
        while (cur1 != cur2) {
            cur1 = (cur1 == null) ? headB : cur1.next;
            cur2 = (cur2 == null) ? headA : cur2.next;
        }
        return cur1;
    }

    public static void main(String[] args) {
        ListNode l1 =new ListNode(8, new ListNode(4, new ListNode(5, null)));
        ListNode l2 = new ListNode(5, new ListNode(0, new ListNode(1, l1)));
        ListNode l3 = new ListNode(2, new ListNode(1, l1));
        System.out.println(getIntersectionNode(l3, l2));
    }
}
