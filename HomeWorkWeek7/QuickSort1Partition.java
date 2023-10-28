public class QuickSort1Partition {
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int pivot = arr.get(low);
        int i = high+1;
        for(int j=high; j>=low; --j) {
            if(arr.get(j)>pivot) {
                --i;
                swap(arr, i, j);
            }
        }
        if(i<=high) {
            swap(arr, i-1, low);
        }
        return arr;
    }
}
