public class BalancedBrackets {
    public static boolean check(char a, char b) {
        if((a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}')) return true;
        return false;
    }


    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> st = new Stack<>();
        for(int i=0; i<(s.length()); ++i) {
            char cur = s.charAt(i);
            if(cur=='(' || cur=='{' || cur=='[') {
                st.push(cur);
            } else {
                if(st.isEmpty()) {
                    return "NO";
                } else if(!check(st.peek(), cur)) {
                    return "NO";
                } else {
                    st.pop();
                }
            }
        }
        if(st.isEmpty()) {
            return "YES";
        }
        return "NO";
    }
}
