public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int n = 100;
        List<Integer> cnt = new ArrayList<>();
        cnt.addAll(Collections.nCopies(n, 0));
        for(int i : arr) {
            int res = cnt.get(i);
            cnt.set(i, res+1);
        }
        return cnt;
    }
}
