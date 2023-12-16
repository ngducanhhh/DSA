public class Bonus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        long[] idx = new long[k];
        for(int i=0; i<n; ++i) {
            arr[i] = sc.nextLong();
        }
        for(int i=0; i<k; ++i) {
            idx[i] = arr[i];
        }
        for(int i=1; i<k; ++i) {
            arr[i] += arr[i-1];
        }
        Arrays.sort(idx);
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0; i<k; ++i) {
            pq.add(idx[i]);
        }
        for(int i=k; i<n; ++i) {
            long cur = pq.poll();
            if(arr[i] > cur) {
                pq.add(arr[i]);
                arr[i] = arr[i-1] + arr[i] - cur;
            } else {
                arr[i] = arr[i-1];
                pq.add(cur);
            }
        }
        for(int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
