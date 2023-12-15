public class Prim {
    public static int minKey(int n, int key[], boolean mstSet[])
    {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < n ; v++)
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }

        return min_index;
    }

    public static int prims(int n, List<List<Integer>> edges, int start) {
        // Write your code here
        int graph[][] = new int[n][n];
        for(int i=0; i<n; ++i) {
            for(int j=0; j<n; ++j) {
                graph[i][j] = Integer.MAX_VALUE;
            }
        }
        for(int i=0; i<edges.size(); ++i) {
            int a = edges.get(i).get(0)-1;
            int b = edges.get(i).get(1)-1;
            int c = edges.get(i).get(2);
            graph[a][b] = Math.min(graph[a][b], c);
            graph[b][a] = Math.min(graph[b][a], c);
        }
        int ans = primMST(graph, n, start);
        return ans;
    }

    public static int primMST(int graph[][], int n, int start) {
        //int parent[] = new int[n];
        int key[] = new int[n];
        boolean mstSet[] = new boolean[n];

        for(int i=0; i<n; ++i) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
        key[start-1] = 0;
        //parent[start] = -1;
        for(int idx = 0; idx < n-1; ++idx) {
            int u = minKey(n, key, mstSet);
            mstSet[u] = true;
            for(int v=0; v<n; ++v) {
                if(graph[u][v]!=Integer.MAX_VALUE && mstSet[v]==false && graph[u][v]<key[v]) {
                    //parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }
        int res = 0;
        for(int i=0; i<n; ++i) {
            res += key[i];
        }
        return res;
    }

}
