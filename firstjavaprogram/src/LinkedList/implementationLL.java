package LinkedList;

class SLL{//user defined data structure
    Node head;
    Node tail;
    int size;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtBeginning(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head = temp;
        }
        size++;
    }
    void insert(int idx , int val){
        Node x  = head;
        if(idx == 0) {
            insertAtBeginning(val);
            return;
        }
        if(idx == size){
            insertAtEnd(val);
            return;
        }
        if(idx > size) {
            System.out.println("Invalid index");
            return;
        }
        Node temp = new Node(val);
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        // insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int getElement(int idx){
        if(idx == size-1) return tail.val;
        if(idx>=size || idx<0){
            System.out.println("Invalid index !!");
            return -1;
        }
        Node temp = head;
        for (int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return  temp.val;
    }
    void setElement(int idx , int val){
        if(idx == size-1){
            tail.val=val;
        }
        if(idx>=size || idx < 0){
            System.out.println("Invalid index");
        }
        Node temp = head;
        for (int i=1;i<=idx;i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteAtBeginning(){
        if(head == null){
            System.out.println("Linked list is empty");
        }
        head = head.next;
        size--;
    }
    void deleteAtIndex(int idx){
        if(idx == 0){
            deleteAtBeginning();
            return;
        }
        if(idx < 0 || idx>=size){
            System.out.println("Invalid index !!");
        }
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        if(temp.next==tail){
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }
    void display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Length of linked list is : "+size);
    }
}
public class implementationLL {
    public static void main(String[] args) {
        SLL ll = new SLL();
        ll.insertAtEnd(10);
        ll.size();
        ll.insertAtEnd(20);
        ll.insertAtEnd(35);
        ll.size();
        ll.display();
        ll.insertAtEnd(46);
        ll.insertAtEnd(55);
        ll.size();
        ll.display();
        ll.insertAtEnd(67);
        ll.insertAtBeginning(77);
        ll.insertAtBeginning(88);
        ll.insert(10,48);
        ll.size();
        ll.display();
        System.out.println(ll.getElement(5));
        //ll.setElement(2,90);
        ll.deleteAtBeginning();
        ll.deleteAtIndex(6);
        ll.display();
    }
}
