public class BFS {
    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        // Write your code here
        int[][] arr = new int[n][n];
        for(int i=0; i<m; ++i) {
            int a = edges.get(i).get(0) - 1;
            int b = edges.get(i).get(1) -1;
            arr[a][b] = 6;
            arr[b][a] = 6;
        }
        List<Integer> dist = new ArrayList<>();
        IntStream.range(0,n).forEach(x -> dist.add(-1));
        boolean[] marked = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s-1);
        marked[s-1] = true;
        while(!queue.isEmpty()) {
            int v = queue.poll();
            for(int i=0; i<n; ++i) {
                if(!marked[i] && arr[v][i]!=0) {
                    marked[i] = true;
                    queue.add(i);
                    if(dist.get(v)==-1) {
                        dist.set(i, arr[v][i]);
                    } else {
                        dist.set(i, dist.get(v)+arr[v][i]);
                    }
                }
            }
        }
        dist.remove(s-1);
        return dist;
    }
}
