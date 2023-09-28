import java.util.Scanner;
public class ThreeSumBn {
    public static int bn(int [] a, int num, int l, int r) {
        while(l<=r) {
            int mid = (l-r)/2;
            if(a[mid]==num) return mid;
            else if(a[mid]>num) {
                r = mid-1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i) {
            a[i] = input.nextInt();
        }
        int cnt = 0;
        for(int i=0; i<=n-3; ++i) {
            for(int j=i+1; j<=n-2; ++j) {
                int k = bn(a, j+1, n-1, -a[i]-a[j]);
                if(k!=-1) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
