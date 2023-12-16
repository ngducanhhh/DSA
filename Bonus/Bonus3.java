public class Bonus3 {
    class ValueAndIndex implements Comparable<ValueAndIndex> {
        int val;
        int idx;
        public ValueAndIndex(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(ValueAndIndex o) {
            return Integer.compare(this.val, o.val);
        }
    }

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            PriorityQueue<ValueAndIndex> pq = new PriorityQueue<>();
            for(int i=0; i<n-1; ++i) {
                int x = sc.nextInt();
                switch(x) {
                    case 1:
                        int u = sc.nextInt();
                        pq.add(new ValueAndIndex(u, i+1));
                        break;
                    case 2:
                        int v = sc.nextInt();
                        while(pq.size()>= v) {
                            pq.poll();
                        }
                        break;
                }
            }
            int a = sc.nextInt();
            int b = sc.nextInt();
            long total = 0;
            List<Integer> index = new ArrayList<>();
            while(!pq.isEmpty()) {
                ValueAndIndex res = pq.poll();
                total += res.val;
                index.add(res.idx);
            }
            Collections.sort(index);
            if(index.size() < b) {
                System.out.println("-1");
            } else {
                System.out.println(total);
                for(int i=0; i<index.size(); ++i) {
                    System.out.print(index.get(i) + " ");
                }
            }
        }
    }
}
