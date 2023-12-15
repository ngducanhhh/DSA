public class CompareTwoLinkedList {
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
}
