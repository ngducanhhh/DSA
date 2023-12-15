public class MergeLinkedList {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1==null && head2!=null) return head2;
        else if(head2==null && head1!=null) return head1;
        else if(head1==null && head2==null) return null;
        SinglyLinkedListNode ptr;
        if(head1.data <= head2.data) {
            ptr = new SinglyLinkedListNode(head1.data);
            ptr.next = mergeLists(head1.next, head2);
        } else {
            ptr = new SinglyLinkedListNode(head2.data);
            ptr.next = mergeLists(head1, head2.next);
        }
        return ptr;
    }
}
