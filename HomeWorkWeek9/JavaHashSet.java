public class JavaHashSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<String> set = new HashSet<>();
        for(int i=0; i<t; ++i) {
            String cur = "";
            cur = cur + pair_left[i] + pair_right[i];
            set.add(cur);
            System.out.println(set.size());
        }

//Write your code here

    }
}
