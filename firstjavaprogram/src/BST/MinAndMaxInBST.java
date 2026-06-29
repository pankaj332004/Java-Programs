package BST;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class MinAndMaxInBST {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(2);
        Node d = new Node(8);
        Node e = new Node(15);
        Node f = new Node(12);
        Node g = new Node(14);
        a.left = b;
        b.left = c;
        b.right = d;
        a.right = e;
        e.left = f;
        e.right = g;
        findMin(a);
        findMax(a);
    }
    public static void findMin(Node a){
        if(a==null) return;
        if(a.left==null){
            System.out.println(a.val);
        }
        findMin(a.left);
    }
    public static void findMax(Node a){
        if(a==null) return;
        if(a.right==null){
            System.out.println(a.val);
        }
        findMax(a.right);
    }
}

// Advantages of BST
// 1. Efficient Searching
// 2. Efficient insertion and deletion
// 3. usage in implementation of other data structure like sets , maps , priority queues

// Disadvantages of BST
// 1. Lack of support for ranges queries
// 2. Not that efficient in case of unbalanced Trees

// Applications
// 1. Phonebook 2. Dictionary 3. Stock market analysis

