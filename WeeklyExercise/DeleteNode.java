public class DeleteNode {
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Write your code here
        if (position == 0) {
            if (llist.next == null) llist = null;
            else {
                llist = llist.next;
            }
        }
        // Write your code here
        SinglyLinkedListNode prev = llist;
        SinglyLinkedListNode prev1 = llist;
        for (int i = 0; i < position; ++i) {
            prev = prev.next;
        }
        for (int i = 0; i < position - 1; ++i) {
            prev1 = prev1.next;
        }
        prev1.next = prev.next;
        return llist;
    }
}
