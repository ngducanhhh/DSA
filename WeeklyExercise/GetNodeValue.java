public class GetNodeValue {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        // Write your code here
        if(llist.next==null) return llist.data;
        int cnt = 0;
        SinglyLinkedListNode ptr = llist;
        while(llist!=null) {
            cnt++;
            llist = llist.next;
        }
        int it = cnt - positionFromTail - 1;
        if(it==0) return ptr.data;
        for(int i=0; i<it; ++i) {
            ptr = ptr.next;
        }
        return ptr.data;
    }
}
