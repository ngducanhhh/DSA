public class Pairs {
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        int res = 0;

        Collections.sort(arr);
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.size(); i++) {
            set.add(arr.get(i));
            if(set.contains(arr.get(i)-k)) {
                res++;
            }
        }

        return res;
    }
}
