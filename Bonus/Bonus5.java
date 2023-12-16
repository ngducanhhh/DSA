public class Bonus5 {
    public class Solution {

        static class SegmentTree {
            int[] arr;
            int[] tree;

            public SegmentTree(int[] arr) {
                this.arr = arr;
                this.tree = new int[4 * arr.length];
                build(1, 0, arr.length - 1);
            }

            public void build(int node, int left, int right) {
                if (left == right) {
                    tree[node] = arr[left];
                } else {
                    int mid = (left + right) / 2;
                    build(2 * node, left, mid);
                    build(2 * node + 1, mid + 1, right);
                    tree[node] = Math.min(tree[2 * node], tree[2 * node + 1]);
                }
            }

            public void updateTree(int node, int left, int right, int idx, int val) {
                if (left == right && left == idx) {
                    arr[idx] = val;
                    tree[node] = val;
                    return;
                }
                if (left > idx || right < idx) {
                    return;
                }
                int mid = (left + right) / 2;
                updateTree(2 * node, left, mid, idx, val);
                updateTree(2 * node + 1, mid + 1, right, idx, val);
                tree[node] = Math.min(tree[2 * node], tree[2 * node + 1]);
            }

            public int query(int node, int left, int right, int ql, int qr) {
                if (ql > right || qr < left) {
                    return Integer.MAX_VALUE;
                }
                if (qr >= right && ql <= left) {
                    return tree[node];
                }
                int mid = (left + right) / 2;
                int lMin = query(2 * node, left, mid, ql, qr);
                int rMin = query(2 * node + 1, mid + 1, right, ql, qr);
                return Math.min(lMin, rMin);
            }
        }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
            }
            SegmentTree sTree = new SegmentTree(arr);
            int m = sc.nextInt();
            for (int i = 0; i < m; ++i) {
                int x = sc.nextInt();
                switch (x) {
                    case 1:
                        int l = sc.nextInt() - 1;
                        int r = sc.nextInt() - 1;
                        int res = sTree.query(1, 0, n - 1, l, r);
                        System.out.println(res);
                        break;
                    case 2:
                        int id = sc.nextInt() - 1;
                        int v = sc.nextInt();
                        sTree.updateTree(1, 0, n - 1, id, v);
                        break;
                }
            }
        }
    }
}
