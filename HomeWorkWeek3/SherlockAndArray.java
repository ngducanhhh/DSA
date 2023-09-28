import java.util.Scanner;
public class SherlockAndArray {
    public static boolean check(int[] arr, int n, int pos) {
        int suml = 0;
        int sumr = 0;
        for(int i=0; i<n; ++i) {
            if(i<pos) {
                suml += arr[i];
            } else if(i>pos) {
                sumr += arr[i];
            }
        }
        if(suml==sumr) return true;
        return false;
    }
    public static String balancedSum(int[] arr, int n) {
        String ans = "NO";
        for(int i=0; i<n; ++i) {
            if(check(arr, n, i)) {
                ans = "YES";
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; ++i) {
            arr[i] = input.nextInt();
        }
        System.out.println(balancedSum(arr, n));
    }
}
