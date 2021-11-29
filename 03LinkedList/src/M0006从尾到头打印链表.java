import java.util.Stack;

public class M0006从尾到头打印链表 {
    public static int[] reversePrint(ListNode head) {
        Stack<Integer> s = new Stack<>();
        while (head != null) {
            s.push(head.val);
            head = head.next;
        }
        int[] res = new int[s.size()];
        int i = 0;
        while (!s.isEmpty()) {
            res[i++] = s.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(3, null)));
        int[] nums1 = reversePrint(l1);
        for(int num: nums1){
            System.out.println(num);
        }
    }
}
