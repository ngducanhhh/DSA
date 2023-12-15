public class JavaStringReverse {
    public static boolean check(String s) {
        int n = s.length();
        for(int i=0; i<n; ++i) {
            if(s.charAt(i)!=s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(check(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
