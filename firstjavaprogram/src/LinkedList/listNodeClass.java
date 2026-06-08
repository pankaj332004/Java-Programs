package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class listNodeClass {
    public static void print(Node head){
//        Node temp = head;
//        while(temp != null) {
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
        Node temp = head;
        if(temp==null) return;
        print(temp.next);
        System.out.println(temp.val);
//        print(temp.next);
    }
    public static void main(String[] args){
            Node a = new Node(10);
            Node b = new Node(20);
            a.next = b; // a -> b linking
            Node c = new Node(30);
            b.next = c;
            Node d = new Node(40);
            c.next = d;
            Node e = new Node(50);
            d.next = e;
            Node f = new Node(60);
            e.next = f;

            print(a);
    }
//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);
//        System.out.println(a.next.next.next.val);
//        System.out.println(a.next.next.next.next.val);


}
