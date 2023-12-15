public class IsThisABST {
    List<Integer> arr = new ArrayList<>();
    void inOrder(Node root) {
        if(root==null) return;
        if(root!=null) {
            inOrder(root.left);
            arr.add(root.data);
            inOrder(root.right);
        }
    }

    boolean checkBST(Node root) {
        inOrder(root);
        for(int i=0; i<arr.size()-1; ++i) {
            if(arr.get(i)>=arr.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}
