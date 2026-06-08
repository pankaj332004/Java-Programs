package Trees;

import java.util.*;
import java.util.logging.Level;

public class Traversal {
    static int n;
    public static class Pair{
        Node node;
        int level;
        Pair(Node node , int level){
            this.node = node;
            this.level= level;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        a.left=b;
        b.left = d;
        a.right = c;
        b.right = e;
        c.right = g;
        c.left = f;
        e.left = h;
        f.right = i;
        System.out.print("Preorder Traversal : ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder Traversal : ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder Traversal : ");
        postorder(a);
        System.out.println();
//        System.out.print("Level order Traversal : ");
//        List<Integer> arr = levelOrder(a);
//        for(int num : arr){
//            System.out.print(num+" ");
//        }

        System.out.println("Level Order Traversal : ");
        levelOrder(a);
        
//        int level = Level(a);
//        for(int x=0;x<=level;x++){
//            n=x;
//            nthLevel(a,0);
//        }
//        System.out.println();

//        System.out.print("Enter n :");
//        n = sc.nextInt();
//        nthLevel(a , 0);
    }
    private static int Level(Node root){
        if(root==null) return 0;
        return 1+Math.max(Level(root.left),Level(root.right));
    }
    private  static  void nthLevel(Node root,int level){
        if(root == null) return;
//        if(level == n) System.out.print(root.val+" ");
        nthLevel(root.left, level+1);
        nthLevel(root.right , level+1);
        if(level == n) System.out.print(root.val+" ");
    }
    private  static  void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    private static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
//    private static List<Integer> levelOrder(Node root){
//        Queue<Node> q = new ArrayDeque<>();
//        List<Integer> arr = new ArrayList<>();
//
//        if(root!=null) q.add(root);
//
//        while(!q.isEmpty()){
//            Node curr = q.remove();
//            arr.add(curr.val);
//            if(curr.left != null){
//                q.add(curr.left);
//            }
//
//            if(curr.right != null) {
//                q.add(curr.right);
//            }
//        }
//        return arr;
//    }
private static void levelOrder(Node root){
        int preLevel = 0;
    Queue<Pair> q = new LinkedList<>();

    if(root!=null) q.add(new Pair(root,0));

    while(q.size() > 0){
        Pair front = q.remove();
        Node temp = front.node;
        int lvl = front.level;
        if(lvl != preLevel) {
            System.out.println();
            preLevel++;
        }

        System.out.print(temp.val+" ");
        if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
        if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));
    }
    System.out.println();;
}
}
