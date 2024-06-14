package LinkedList;

public class Reverse {
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode curr = head, temp = null, prev = null;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
