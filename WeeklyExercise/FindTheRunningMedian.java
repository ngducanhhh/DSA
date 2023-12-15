public class FindTheRunningMedian {
    public static List<Double> runningMedian(List<Integer> a) {
        // Write your code here
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Double> ans = new ArrayList<>();
        for(int i=0; i<a.size(); ++i) {
            if(maxHeap.isEmpty() || a.get(i)<=maxHeap.peek()) {
                maxHeap.add(a.get(i));
            } else {
                minHeap.add(a.get(i));
            }
            if(maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if(minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }

            if(minHeap.size()==maxHeap.size()) {
                ans.add((minHeap.peek() + maxHeap.peek())/2.0);
            } else {
                ans.add(maxHeap.peek()/1.0);
            }
        }
        return ans;
    }
}
