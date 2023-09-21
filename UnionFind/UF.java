public class UF {
    public int cnt;
    public int res;
    public int[] parent;

    public UF(int n) {
        parent = new int[n];
        cnt = n;
        res = 0;
        for(int i=0; i<n; ++i) {
            parent[i] = i;
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
        cnt--;
        res++;
        int rootP = find(p);
        int rootQ = find(q);
        if(rootP==rootQ) return;
        parent[rootQ] = rootP;
    }
}
