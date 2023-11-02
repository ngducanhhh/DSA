public class LevelOrder {
    public static int getHeight(Node root) {
        if(root==null) return -1;
        else {
            int mLeft = getHeight(root.left);
            int mRight = getHeight(root.right);
            return Math.max(mLeft, mRight) + 1;
        }
    }

    public static void printLevel(Node root, int lvl) {
        if(root==null) return;
        if(lvl==1) {
            System.out.print(root.data + " ");
        } else if(lvl>1) {
            printLevel(root.left, lvl-1);
            printLevel(root.right, lvl-1);
        }
    }
}
