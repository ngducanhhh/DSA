public class InsertionSort1 {
    public static String printArray(List<Integer> arr) {
        int[] newArr = arr.stream().mapToInt(i -> i).toArray();
        return Arrays.stream(newArr)
                .mapToObj(j -> String.valueOf(j))
                .collect(Collectors.joining(" "));
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        for(int i=1; i<n; ++i) {
            int j = i-1;
            int res = arr.get(i);
            while(j>=0 && arr.get(j) > res) {
                arr.set(j+1, arr.get(j));
                --j;
                System.out.println(printArray(arr));
            }
            arr.set(j+1, res);
        }
        System.out.println(printArray(arr));
    }
}
