public class FindTheRunningMedian {
    public static List<Double> runningMedian(List<Integer> a) {
        // Write your code here
        List<Double> ans = new ArrayList<Double>();
        int n = a.size();
        List<Integer> res = new ArrayList<Integer>();
        int sz = 0;
        for(int i=0; i<n; ++i) {
            res.add(a.get(i));
            ++sz;
            Collections.sort(res);
            double med = 0;
            if(sz%2==0) {
                med = (double)(res.get(sz/2) + res.get(sz/2-1))/2;
            } else {
                med = (double)res.get((sz-1)/2);
            }
            ans.add(med);
        }
        return ans;
    }
}
