package Trees;

import java.util.Scanner;
import java.util.Stack;

public class IterativeTraversal {
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

        System.out.println("PreOrder Traversal : ");
        preorderTraversal(a);

        System.out.println("PostOrder Traversal : ");
        postorderTraversal(a);

        System.out.println("Inorder Traversal : ");
        inorderTraversal(a);
    }
    private static  void preorderTraversal(Node root){
        Stack<Node> st = new Stack<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            Node front = st.pop();
            System.out.print(front.val+" ");

            if(front.right!=null) st.push(front.right);
            if(front.left!=null) st.push(front.left);
        }
        System.out.println();
    }

    private  static  void inorderTraversal(Node root){
        Stack<Node> st = new Stack<>();
        Node temp=root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp = temp.left;
            }else{
                if(st.isEmpty()) break;
                Node top = st.pop();
                System.out.print(top.val+" ");
                temp = top.right;
            }
        }
    }

    private static  void postorderTraversal(Node root){
        Stack<Node> st = new Stack<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            Node front = st.pop();
            System.out.print(front.val+" ");

            if(front.left!=null) st.push(front.left);
            if(front.right!=null) st.push(front.right);
        }
        System.out.println();
    }
}
