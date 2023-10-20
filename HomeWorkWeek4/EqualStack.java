public class EqualStack {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int h1Sum=0;
        int h2Sum=0;
        int h3Sum=0;
        Stack<Integer> h1st =new Stack<>();
        Stack<Integer> h2st =new Stack<>();
        Stack<Integer> h3st =new Stack<>();
        for(int i=h1.size()-1;i>=0;i--){
            h1Sum+=h1.get(i);
            h1st.push(h1.get(i));
        }
        for(int i=h2.size()-1;i>=0;i--){
            h2Sum+=h2.get(i);
            h2st.push(h2.get(i));
        }
        for(int i=h3.size()-1;i>=0;i--){
            h3Sum+=h3.get(i);
            h3st.push(h3.get(i));
        }
        while(!(h1st.isEmpty()) || !(h2st.isEmpty()) || !(h3st.isEmpty())){
            if(h1Sum>h2Sum || h1Sum>h3Sum){
                int store = h1st.pop();
                h1Sum-=store;
            }
            else  if(h2Sum>h1Sum || h2Sum>h3Sum){
                int store = h2st.pop();
                h2Sum-=store;
            }
            else  if(h3Sum>h1Sum || h3Sum>h2Sum){
                int store = h3st.pop();
                h3Sum-=store;
            }
            else
            {
                return h1Sum;
            }

        }
        return 0;
    }
}
