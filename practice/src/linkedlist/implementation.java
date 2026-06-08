package linkedlist;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class sll{
    Node head;
    Node tail;
    int size;
    void insertHead(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertTail(int val){
        Node temp =new Node(val);
        if(head==null) head = tail= temp;
        else{
            tail.next=temp;
            tail = temp;
        }
        size++;
    }
    void insertAtIndex(int idx , int val){
        Node x = head;
        Node temp = new Node(val);
        if(idx < 0 || idx > size){
            System.out.println("Invalid index !!");
            return;
        }
        if(idx == 0){
            insertHead(val);
            return;
        }
        if(idx == size){
            insertTail(val);
            return;
        }
        for(int i=0;i<idx-1;i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    void deleteHead(){
        if( head == null){
            System.out.println("Linked list is empty");
        }
        head = head.next;
        size--;
    }
    void deleteAtIndex(int idx){
        if(idx==0){
            deleteHead();
            return;
        }
        if(idx<0 && idx >=size){
            System.out.println("Invalid index !!");
        }
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        if(temp.next==tail){
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }
    void size(){
        System.out.println("Length of linked list : "+size);
    }
    void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class implementation {
    public static void main(String[] args) {
        sll ll = new sll();
        ll.insertHead(11);
        ll.traverse();
        ll.insertTail(12);
        ll.traverse();
        ll.insertTail(13);
        ll.insertAtIndex(5,18);
        ll.insertHead(10);
        ll.insertTail(14);
        ll.insertHead(9);
        ll.size();
        ll.traverse();
        ll.insertTail(15);
        ll.deleteHead();
        ll.traverse();
        ll.deleteAtIndex(5);
        ll.size();
        ll.traverse();
    }
}
