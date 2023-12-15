public class JesseAndCookies {
    public static int cookies(int k, List<Integer> A) {
        // Write your code here
        PriorityQueue<Integer> queue = new PriorityQueue<>(A);
        int res = 0;
        while(queue.size()>=2 && queue.peek()<k) {
            queue.add(queue.poll() + 2*queue.poll());
            ++res;
        }
        if(queue.peek() >= k) {
            return res;
        }
        return -1;
    }
}
