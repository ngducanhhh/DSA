public class FindTheMedian {
    public static void swap(List<Integer> arr, int i, int j) {
        int tmp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, tmp);
    }

    public static void sort(List<Integer> arr) {
        int n = arr.size();
        for(int i=0; i<n-1; ++i) {
            for(int j=i+1; j<n; ++j) {
                if(arr.get(i)>arr.get(j)) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        sort(arr);
        int n = arr.size();
        return arr.get((n-1)/2);
    }
}
