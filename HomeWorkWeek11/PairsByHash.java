public class PairsByHash {
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        List<Integer> hash = new ArrayList<>();
        for(int i=0; i<n; ++i) {
            for(int j=0; j!=i && j<n; ++j) {
                int res = Math.abs(arr.get(i)-arr.get(j));
                hash.add(res);
            }
        }
        int sz = hash.size();
        int ans = 0;
        for(int i=0; i<sz; ++i) {
            if(hash.get(i)==k) ++ans;
        }
        return ans;
    }
}
