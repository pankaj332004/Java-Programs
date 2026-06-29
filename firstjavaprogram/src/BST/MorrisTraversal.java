package BST;

public class MorrisTraversal {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.left.right.left = new Node(3);
        root.right.left = new Node(6);
        root.right.left.right = new Node(7);
        root.right.right = new Node(9);
        root.right.right.right = new Node(10);
        morris(root);
    }
    public static void morris(Node curr){
        while(curr!=null){
            if(curr.left!=null){
                Node pred = curr.left;
                while (pred.right!=null &&  pred.right!= curr){
                    pred = pred.right;
                }
                if(pred.right==null){
                    pred.right=curr;
                    curr=curr.left;
                }
                else{
                    visit(curr);
                    curr = curr.right;
                    pred.right=null;
                }
            }
            else{
                visit(curr);
                curr = curr.right;
            }
        }
    }
    public static void visit(Node curr){
        System.out.print(curr.val+" ");
    }
}
