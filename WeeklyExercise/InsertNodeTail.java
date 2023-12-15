public class InsertNodeTail {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode insertionNode = new SinglyLinkedListNode(data);
        if (head == null) {
            head = new SinglyLinkedListNode(data);
            return head;
        }
        SinglyLinkedListNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = insertionNode;
        insertionNode.next = null;
        return head;
    }
}
