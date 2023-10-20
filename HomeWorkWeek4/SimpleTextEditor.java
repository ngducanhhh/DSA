import java.util.Scanner;
import java.util.Stack;
public class SimpleTextEditor {
    public static void append(String w, String s) {
        s += w;
    }

    public static void delete(int k, String s) {
        int n = s.length();
        int rmn = n-k;
        String cur = "";
        if(s.length()==k) s = "";
        for(int i=0; i<rmn; ++i) {
            cur += s.charAt(i);
        }
        s = cur;
    }

    public static void print(int k, String s) {
        System.out.println(s.charAt(k-1));
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s = "";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<String> st = new Stack<>();
        for(int i=0; i<t; ++i) {
            int x = sc.nextInt();
            if(x==1) {
                String w = sc.next();
                append(w, s);
                st.push(s);
            }
            if(x==2) {
                int k = sc.nextInt();
                delete(k, s);
                st.push(s);
            }
            if(x==3) {
                int k = sc.nextInt();
                print(k, s);
                st.push(s);
            }
            if(x==4) {
                s = st.peek();
                st.push(s);
            }
        }
    }
}
