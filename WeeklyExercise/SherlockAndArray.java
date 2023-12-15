public class SherlockAndArray {
    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int total = 0;
        for(int i: arr)
        {
            total = total + i;
        }

        int lsum =0;
        for(int i=0;i<arr.size();i++)
        {
            int rsum = total - lsum -arr.get(i);
            if(lsum == rsum)
                return "YES";
            lsum = lsum + arr.get(i);
        }
        return "NO";
    }
}
