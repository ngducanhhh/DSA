public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int ans = 0;
        if(arr.size()%2!=0) {
            ans = arr.get(arr.size()/2);
        } else {
            ans = (arr.get(arr.size()/2-1) + arr.get(arr.size()/2))/2;
        }
        return ans;
    }
}
