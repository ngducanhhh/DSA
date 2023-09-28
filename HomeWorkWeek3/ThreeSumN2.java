import java.util.Scanner;
public class ThreeSumN2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i) {
            a[i] = input.nextInt();
        }
        int cnt = 0;
        for(int i=0; i<n-1; ++i) {
            int j = i+1;
            for(int k=n-1; k>i+1; k--) {
                int sum = a[i] + a[j] + a[k];
                if(sum==0) {
                    cnt++;
                    j++;
                } else if(sum < 0) {
                    j++;
                } else break;
            }
        }
        System.out.println(cnt);
    }
}
