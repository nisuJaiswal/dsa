package LinkedList;

public class RemoveNthFromEnd {
    public static ListNode removeFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = dummy;

        while (n > 0) {
            right = right.next;
            n--;
        }

        while (right.next != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return dummy.next;

    }
}
