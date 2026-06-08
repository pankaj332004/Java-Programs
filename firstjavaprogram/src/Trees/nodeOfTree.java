package Trees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class nodeOfTree {
    public static void main(String[] args) {
        Node A = new Node(1); // A is the root node
        Node B = new Node(4);
        Node C = new Node(3);
        Node D = new Node(2);
        Node E = new Node(6);
        Node F = new Node(5);
        Node G = new Node(7);
        Node H = new Node(8);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.right = F;
        C.left = G;
        E.right = H;
//        System.out.println(E.val);
//        System.out.println(A.left.right.val);

        display(A);
        System.out.println();
        System.out.println(Sum(A));
        System.out.println(product(A));
        System.out.println(max(A));
        System.out.println(min(A));
        System.out.println(size(A));
        System.out.println(level(A));
        int height = level(A);
        System.out.println("Height : "+ (height-1));
    }
    private  static  void display(Node root){
        if(root==null) return;  // base case;
        System.out.print(root.val+" ");
        display(root.left); // left subtree
        display(root.right);// right subtree
    }
    private static  int  Sum(Node root){
        if(root == null) return 0;
        return root.val + Sum(root.left) + Sum(root.right);
    }
    private  static   int product(Node root){
        if(root == null) return 1;
        if(root.val==0){
            root.val=1;
        }
        return root.val * product(root.left) * product(root.right);
    }
    private static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val , Math.max(max(root.left) , max(root.right)));
    }
    private static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val , Math.min(min(root.left),min(root.right)));
    }
    private static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    private  static int level(Node root){
        if(root==null) return 0;
        return 1+ Math.max(level(root.left),level(root.right));
    }

}
