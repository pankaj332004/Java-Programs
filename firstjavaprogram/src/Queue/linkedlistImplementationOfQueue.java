package Queue;

public class linkedlistImplementationOfQueue {
    public static class  Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static class queuell{
        Node head = null;
        Node tail = null;
        int size=0;
        public void add(int x){
            Node temp = new Node(x);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x= head.val;;
            head=head.next;
            size--;
            return x;
        }
        public boolean isEmpty(){
            if(size==0){
                return true;
            }return false;
        }
        public void display(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        queuell q=new queuell();
        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
    }
}
