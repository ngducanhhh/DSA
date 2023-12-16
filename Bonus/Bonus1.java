public class Bonus1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] height = new long[n];
        for(int i=0; i<n; ++i) {
            height[i] = sc.nextLong();
        }
        Arrays.sort(height);
        PriorityQueue<Long> lp = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> rp = new PriorityQueue<>();
        // if(n==0) System.out.println("0");
        if(n%2!=0) {
            for(int i=0; i<=n/2; ++i) {
                lp.add(height[i]);
            }
            for(int i=n/2+1; i<n; ++i) {
                rp.add(height[i]);
            }
        } else {
            for(int i=0; i<n/2; ++i) {
                lp.add(height[i]);
            }
            for(int i=n/2; i<n; ++i) {
                rp.add(height[i]);
            }
        }
        for(int i=0; i<m; ++i) {
            int x = sc.nextInt();
            switch(x) {
                case 1:
                    long u = sc.nextLong();
                    if(lp.isEmpty() && rp.isEmpty()) {
                        lp.add(u);
                    } else{
                        if(u<=lp.peek()) {
                            lp.add(u);
                        } else {
                            rp.add(u);
                        }
                    }
                    if(lp.size()-rp.size()>=2) {
                        rp.add(lp.poll());
                    }
                    if(rp.size()-lp.size()>=1) {
                        lp.add(rp.poll());
                    }
                    break;
                case 2:
                    if(!lp.isEmpty()) {
                        lp.poll();
                    }
                    if(lp.size()-rp.size()>=2) {
                        rp.add(lp.poll());
                    }
                    if(rp.size()-lp.size()>=1) {
                        lp.add(rp.poll());
                    }
                    break;
                case 3:
                    if(lp.isEmpty()) {
                        System.out.println("0");
                    } else {
                        System.out.println(lp.peek());
                    }
                    break;
            }
        }
    }
}
