public class HeightOfBinaryTree {
    public static int height(Node root) {
        // Write your code here.
        if(root==null) return -1;
        else {
            int mLeft = height(root.left);
            int mRight = height(root.right);
            return Math.max(mLeft, mRight) + 1;
        }
    }
}
