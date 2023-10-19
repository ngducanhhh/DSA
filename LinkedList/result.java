public class result {
    static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

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

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode insertionNode = new SinglyLinkedListNode(data);
        insertionNode.next = llist;
        llist = insertionNode;
        return llist;

    }

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        if (position == 0) {
            llist = new SinglyLinkedListNode(data);
        } else {
            SinglyLinkedListNode prev_node = llist;
            for (int i = 0; i < position - 1; ++i) {
                prev_node = prev_node.next;
            }
            SinglyLinkedListNode insertionNode = new SinglyLinkedListNode(data);
            insertionNode.next = prev_node.next;
            prev_node.next = insertionNode;
        }
        return llist;
    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
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

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1.next != null && head2.next != null) {
            if (head1.data != head2.data) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        int cnt1 = 0;
        int cnt2 = 0;
        while (head1 != null) {
            cnt1++;
            head1 = head1.next;
        }
        while (head2 != null) {
            cnt2++;
            head2 = head2.next;
        }
        if (cnt1 != cnt2) return false;
        return true;
    }

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

}
