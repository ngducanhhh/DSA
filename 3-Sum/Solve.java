import java.util.Scanner;
public class Solve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i) {
            a[i] = input.nextInt();
        }
        int cnt = 0;
        // Do phuc tap cua thuat toan la O(n^3)
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    if(a[i] + a[j] + a[k]==0) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
