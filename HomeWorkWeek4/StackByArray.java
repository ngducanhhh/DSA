public class StackByArray {
    static final int nmax = 1000;
    int top;
    int[] arr = new int[nmax];

    // Constructor
    StackByArray() {
        top = -1;
    }

    // print the stack
    void print() {
        for(int i=top; i>-1; --i) {
            System.out.println(arr[i] + "->");
        }
    }

    // check if the stack is empty
    boolean isEmpty() {
        return top < 1;
    }

    // check if the stack is full
    boolean isFull() {
        return top >= nmax-1;
    }

    // push
    void push(int val) {
        if(isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = val;
        System.out.println(val + "has been pushed into the stack!");
    }

    // pop
    int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int key = arr[top];
        --top;
        return key;
    }

    public static void main(String[] args) {
        StackByArray st = new StackByArray();
        st.push(1);
        st.push(2);
        st.push(3);
        st.print();
        System.out.println();
        System.out.println(st.pop() + "has been removed from the stack!");
        st.print();
    }
}
