public class NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        for(int i=0; i<q.size(); i++) {
            if(q.get(i) > i+1 + 2) {
                System.out.println("Too chaotic");
                return;
            }
        }

        int cnt = 0;
        for(int i=0; i<q.size(); i++) {
            for(int j=i+1; j<q.size(); j++) {
                if(q.get(i) > i+1) {
                    int temp = q.get(i);
                    q.set(i,q.get(j));
                    q.set(j,temp);
                    cnt++;
                }
                if(q.get(i) == i+1) break;
            }
        }
        System.out.println(cnt);
    }
}
