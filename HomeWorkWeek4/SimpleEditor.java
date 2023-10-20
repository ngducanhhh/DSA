public class SimpleEditor {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s = "";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<String> st = new Stack<>();
        sc.nextLine();
        for (int i = 0; i < t; ++i) {
            int x = sc.nextInt();
            switch (x) {
                case 1: {
                    st.push(s);
                    String w = sc.next();
                    s += w;
                    break;
                }
                case 2: {
                    st.push(s);
                    int k = sc.nextInt();
                    if (k <= s.length()) {
                        s = s.substring(0, s.length() - k);
                    } else {
                        s = "";
                    }
                    break;
                }
                case 3: {
                    int k = sc.nextInt();
                    if (k > 0 && k <= s.length()) {
                        System.out.println(s.charAt(k - 1));
                    }
                    break;
                }
                case 4: {
                    s = st.pop();
                    break;
                }
            }
        }
    }
}
