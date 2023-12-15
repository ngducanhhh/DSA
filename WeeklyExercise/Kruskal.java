public class Kruskal {
    class Edge implements Comparable<Edge> {
        public int u, v, w;
        public Edge(int v1, int v2, int weight) {
            u = v1;
            v = v2;
            w = weight;
            if(u>v) {
                int tmp = u;
                u = v;
                v= tmp;
            }
        }
        @Override
        public int compareTo(Edge e) {
            if(w < e.w) return -1;
            if(w > e.w) return 1;
            if(v < e.v) return -1;
            if(v > e.v) return 1;
            return Integer.compare(u, v);
        }
    }

    class UF {
        public int[] parent;
        public int[] size;

        public UF(int n) {
            parent = new int[n+1];
            size = new int[n+1];
            for(int i=0; i<=n; ++i) {
                parent[i] = i;
                size[i] = 0;
            }
        }

        public int find(int n) {
            while(n!=parent[n]) {
                n = parent[n];
            }
            return n;
        }

        public boolean connected(int p, int q) {
            return find(p)==find(q);
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if(rootP==rootQ) return;
            else {
                if(size[rootP] > size[rootQ]) {
                    int tmp = rootP;
                    rootP = rootQ;
                    rootQ = tmp;
                }
                parent[rootQ] = rootP;
                size[rootP] += size[rootQ];
            }
        }
    }

    class Solution {
        private static int kruskal(int n, Queue<Edge> pq) {
            int minMST = 0;
            UF uf = new UF(n);
            for(int i=1; i<n; ++i) {
                Edge min = pq.poll();
                while(!pq.isEmpty() && uf.connected(min.u, min.v)) {
                    min = pq.poll();
                }
                uf.union(min.u, min.v);
                minMST += min.w;
            }
            return minMST;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int path = sc.nextInt();
            Queue<Edge> pq = new PriorityQueue<>();
            for(int i=0; i<path; ++i) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                Edge e = new Edge(u, v, w);
                pq.add(e);
            }
            System.out.println(kruskal(n, pq));
        }
    }

}
