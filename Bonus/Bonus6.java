public class Bonus6 {
    class PQ {
        private int size = 0;
        private int[] arr;
        private int MAX_SIZE;

        public PQ(int capacity) {
            MAX_SIZE = capacity;
            arr = new int[MAX_SIZE];
        }

        public int getSize() {
            return size;
        }

        public void add(int value) {
            if(size==MAX_SIZE) {
                return;
            }
            arr[size] = value;
            ++size;
            Up();
        }

        public int peek() {
            if(size==0) {
                return -1;
            }
            return arr[0];
        }

        public int poll() {
            int item = arr[0];
            arr[0] = arr[size-1];
            --size;
            Down();
            return item;
        }

        private void Up() {
            int idx = size - 1;

            while (idx > 0) {
                int midIdx = (idx - 1) / 2;

                if (arr[idx] < arr[midIdx]) {
                    swap(idx, midIdx);
                    idx = midIdx;
                } else {
                    break;
                }
            }
        }

        private void Down() {
            int idx = 0;

            while (true) {
                int leftidx = 2 * idx + 1;
                int rightidx = 2 * idx + 2;
                int minIdx = idx;

                if (leftidx < size && arr[leftidx] < arr[minIdx]) {
                    minIdx = leftidx;
                }
                if (rightidx < size && arr[rightidx] < arr[minIdx]) {
                    minIdx = rightidx;
                }

                if (minIdx != idx) {
                    swap(idx, minIdx);
                    idx = minIdx;
                } else {
                    break;
                }
            }
        }

        public void swap(int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    class Result {

        /*
         * Complete the 'cookies' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER k
         *  2. INTEGER_ARRAY A
         */

        public static int cookies(int k, List<Integer> A) {
            // Write your code here
            int ans = 0;
            PQ pq = new PQ(A.size());
            for(int i=0; i<A.size(); ++i) {
                pq.add(A.get(i));
            }
            while(pq.getSize() > 1 && pq.peek() < k) {
                pq.add(pq.poll() + 2*pq.poll());
                ++ans;
            }
            if(pq.peek() >= k ) {
                return ans;
            }
            return -1;
        }

    }
}
