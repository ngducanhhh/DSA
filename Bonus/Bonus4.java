public class Bonus4 {
    public class Solution {
        static int[] a;
        static int[] tree;

        public static void build(int node, int start, int end) {
            if (start == end) {
                tree[node] = a[start];
            } else {
                int mid = (start + end) / 2;
                build(2 * node, start, mid);
                build(2 * node + 1, mid + 1, end);
                tree[node] = Math.max(tree[2 * node], tree[2 * node + 1]);
            }
        }

        public static int query(int node, int start, int end, int l, int r) {
            if (r < start || end < l) {
                return Integer.MIN_VALUE;
            }
            if (l <= start && end <= r) {
                return tree[node];
            }
            int mid = (start + end) / 2;
            int leftQuery = query(2 * node, start, mid, l, r);
            int rightQuery = query(2 * node + 1, mid + 1, end, l, r);
            return Math.max(leftQuery, rightQuery);
        }

        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            a = new int[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            tree = new int[4 * n];
            build(1, 1, n);
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                System.out.println(query(1, 1, n, l, r));
            }
        }
    }
}
