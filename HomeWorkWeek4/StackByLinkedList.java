public class StackByLinkedList {
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    // print the stack
    void print() {
        StackNode ptr = root;
        while(ptr!=null) {
            System.out.println(ptr.data + "->");
            ptr = ptr.next;
        }
    }

    // check if the stack is empty
    boolean isEmpty() {
        return root == null;
    }

    // push
    void push(int val) {
        StackNode insertionNode = new StackNode(val);
        if(isEmpty()) {
            root = new StackNode(val);
        } else {
            insertionNode.next = root;
            root = insertionNode;
        }
        System.out.println(val + "has been pushed into the stack!");
    }

    // pop
    int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int key = root.data;
        root = root.next;
        return key;
    }

    public static void main(String[] args) {
        StackByLinkedList st = new StackByLinkedList();
        st.push(1);
        st.push(2);
        st.push(3);
        st.print();
        System.out.println();
        System.out.println(st.pop() + "has been removed from the stack!");
        st.print();
    }
}
