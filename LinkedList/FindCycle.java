package LinkedList;

class FindCycle {
    public static boolean isCycle(ListNode head) {
        ListNode forward = head, backward = head;

        while (forward != null && forward.next != null) {
            forward = forward.next.next;
            backward = backward.next;

            if (forward == backward)
                return true;
        }

        return false;
    }
}