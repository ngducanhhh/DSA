public class ReverseLinkedList {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        // Write your code here
        if (head == null || head.next == null) return head;
        SinglyLinkedListNode rest = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
}
