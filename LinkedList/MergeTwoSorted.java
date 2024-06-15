package LinkedList;

public class MergeTwoSorted {
    public static ListNode mergeLinkedLists(ListNode l1, ListNode l2) {
        // If one list is null then immediately return another one
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        // Creating a Dummy node to append the resultatnt list
        ListNode dummy = new ListNode();

        // A node which keeps the track of the end of the resultatnt list
        ListNode tail = dummy;

        // Compare and add smaller element into resultatnt list
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;

            // If any one is non-empty then append it into resultatnt list
            if (l1 != null)
                tail.next = l1;
            else if (l2 != null)
                tail.next = l2;
            else {
            }
        }

        // Return the list
        return dummy.next;

    }
}
