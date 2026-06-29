package BST;

public class countBSTsubtree {
    public static boolean subtreeCntRecur(Node root, int low,
                                   int high, int[] ans) {
        if (root == null) return true;
        boolean left = subtreeCntRecur(root.left, low, high, ans);
        boolean right = subtreeCntRecur(root.right, low, high, ans);
        if (root.val >= low && root.val <= high && left && right) {
            ans[0]++;
            return true;
        }
        return false;
    }
    public static int subtreeCnt(Node root, int low, int high) {
        int[] ans = {0};
        subtreeCntRecur(root, low, high, ans);
        return ans[0];
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(1);
        root.right = new Node(50);
        root.right.left = new Node(40);
        root.right.right = new Node(100);
        int low = 1, high = 45;
        System.out.println(subtreeCnt(root, low, high));
    }
}
