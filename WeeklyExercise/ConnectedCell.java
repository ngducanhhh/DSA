public class ConnectedCell {
    public static int count(int i, int j, List<List<Integer>> matrix) {
        int cnt = 0;
        int n = matrix.size();
        int m = matrix.get(0).size();
        if(i<0 || j<0 || i>=n || j>=m || matrix.get(i).get(j)==0) {
            return 0;
        }
        cnt = 1;
        matrix.get(i).set(j, 0);
        cnt += count(i, j, matrix);
        cnt += count(i-1, j, matrix);
        cnt += count(i, j-1, matrix);
        cnt += count(i-1, j-1, matrix);
        cnt += count(i+1, j, matrix);
        cnt += count(i, j+1, matrix);
        cnt += count(i-1, j+1, matrix);
        cnt += count(i+1, j-1, matrix);
        cnt += count(i+1, j+1, matrix);
        return cnt;
    }


    public static int connectedCell(List<List<Integer>> matrix) {
        // Write your code here
        int n = matrix.size();
        int m = matrix.get(0).size();
        int nmax = 0;
        for(int i=0; i<n; ++i) {
            for(int j=0; j<m; ++j) {
                int res = count(i, j, matrix);
                nmax = Math.max(nmax, res);
            }
        }
        return nmax;
    }
}
