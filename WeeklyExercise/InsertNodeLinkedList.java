public class InsertNodeLinkedList {
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode insertionNode = new SinglyLinkedListNode(data);
        insertionNode.next = llist;
        llist = insertionNode;
        return llist;
    }
}
