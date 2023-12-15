public class ClosestNumber {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        for(int i=0; i<arr.size(); ++i) {
            System.out.print(arr.get(i) + " ");
        }
        int n = arr.size();
        int min = 1000001;
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<n-1; ++i) {
            int sum = Math.abs(arr.get(i)-arr.get(i+1));
            min = Math.min(min, sum);
        }
        for(int i=0; i<n-1; ++i) {
            int sum = Math.abs(arr.get(i)-arr.get(i+1));
            if(sum==min) {
                ans.add(arr.get(i));
                ans.add(arr.get(i+1));
            }
        }
        return ans;
    }
}
