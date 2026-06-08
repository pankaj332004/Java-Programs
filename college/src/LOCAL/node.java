package LOCAL;

public class node {
    int data;
    node left, right;

    node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }

    public static void f1(node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data+" ");
            f1(root.left);
            f1(root.right);
        }
    }
    public static void f2(node root) {
        if (root == null) {
            return;
        } else {
            f1(root.left);
            System.out.print(root.data + " ");
            f1(root.right);
        }
    }
    public static  void oneChild(node  root){

    }

    public static void main(String[] args) {
        node root;
        root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.right = new node(6);

        // 🟢 Call the traversal function
        System.out.print("preorder traversal: ");
        f1(root);  // This will print the nodes in preorder
        System.out.println();
        System.out.print("inorder traversal : ");
        f2(root); // this will print the nodes in inorder traversal
    }
}
