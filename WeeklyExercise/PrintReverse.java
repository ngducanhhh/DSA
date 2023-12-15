public class PrintReverse {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head == null || head.next == null) return head;
        SinglyLinkedListNode rest = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public static void reversePrint(SinglyLinkedListNode llist) {
        // Write your code here
        llist = reverse(llist);
        while (llist != null) {
            System.out.println(llist.data);
            llist = llist.next;
        }
    }
}
