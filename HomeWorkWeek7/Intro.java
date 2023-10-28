public class Intro {
    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        int l = 0;
        int r = arr.size()-1;
        int mid;
        while(l<=r) {
            mid = (r+l)/2;
            if(arr.get(mid)==V) return mid;
            else if(arr.get(mid)<V) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
