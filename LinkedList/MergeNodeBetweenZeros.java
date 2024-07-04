package LinkedList;

public class MergeNodeBetweenZeros {
    public static ListNode getAddedList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int sum = 0;
        head = head.next;

        while (head != null) {
            if (head.val == 0) {
                // ListNode node = new ListNode(sum);
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0;
            }
            sum += head.val;
            head = head.next;
        }
        return dummy.next;
    }
}
