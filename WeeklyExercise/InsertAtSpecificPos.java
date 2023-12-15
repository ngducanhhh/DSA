public class InsertAtSpecificPos {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        SinglyLinkedListNode x = new SinglyLinkedListNode(data); if(position == 0){ x.next = llist; llist = x; return llist;}
        SinglyLinkedListNode head = llist;
        int count =0;

        while (head != null && count < position-1){
            head = head.next;
            count++;
        }
        x.next = head.next;
        head.next = x;


        return llist;
    }
}
