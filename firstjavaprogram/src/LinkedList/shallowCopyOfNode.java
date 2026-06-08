package LinkedList;

public class shallowCopyOfNode {
    public static void main(String[] args) {
        Node a = new Node(100);
        //System.out.println(a.val);
        //Node temp = a// shallow copy
        Node temp = new Node(100); // deep copy
        System.out.println(a);
        System.out.println(temp);
    }
}
