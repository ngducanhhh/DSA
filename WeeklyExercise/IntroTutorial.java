public class IntroTutorial {
    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        for(int i=0; i<arr.size(); ++i) {
            if(V==arr.get(i)) return i;
        }
        return -1;
    }
}
