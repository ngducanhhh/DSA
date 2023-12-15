public class JavaHashSet {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        Set<String> set = new HashSet<String>();

        for(int i = 0; i < t; i++){
            String element = scan.nextLine();
            if(!set.contains(element)){
                set.add(element);
            }
            System.out.println(set.size());
        }
    }
}
