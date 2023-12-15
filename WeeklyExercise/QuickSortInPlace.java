public class QuickSortInPlace {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void print(int[] arr, int n) {
        for(int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int[] arr, int n, int low, int high) {
        int pivot = arr[high];
        int i=low-1;
        for(int j=low; j<=high; ++j) {
            if(arr[j]<pivot) {
                ++i;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        print(arr, n);
        System.out.println();
        return i+1;
    }

    public static void quickSort(int[] arr, int n, int low, int high) {
        if(low<high) {
            int pi = partition(arr, n, low, high);

            quickSort(arr, n, low, pi-1);
            quickSort(arr, n, pi+1, high);

        }
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, n, 0, n-1);
    }
}
