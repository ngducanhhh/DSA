public class QueueByArray {
    int front, rear, sz;
    int cap;
    int[] arr;

    // Constructor
    QueueByArray(int capacity) {
        this.cap = capacity;
        front = this.sz = 0;
        rear = capacity - 1;
        arr = new int[this.cap];
    }

    // Check if the queue is full
    boolean isFull() {
        return sz == cap;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        return sz == 0;
    }

    void printQueue() {
        for(int i=rear; i>=front; --i) {
            System.out.print(arr[i] + "->");
        }
    }

    // enqueue
    void enqueue(int data) {
        if(isFull()) {
            System.out.println("The queue is full!");
            return;
        } else {
            rear = (rear+1)%cap;
            arr[rear] = data;
            ++sz;
        }
        System.out.println(data + "has been pushed into the queue!");
    }

    // dequeue
    int dequeue() {
        if(isEmpty()) {
            System.out.println("The queue is empty!");
            return -1;
        }
        int item = arr[front];
        front = (front+1)%cap;
        --sz;
        return item;
    }

    // get front
    int getFront() {
        if(isEmpty()) {
            System.out.println("Can not get the front element because the stack is empty!");
            return -1;
        }
        return arr[front];
    }

    // get rear
    int getRear() {
        if(isEmpty()) {
            System.out.println("Can not get the rear element because the stack is empty!");
            return -1;
        }
        return arr[rear];
    }
}
