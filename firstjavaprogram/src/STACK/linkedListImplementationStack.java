package STACK;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
public class linkedListImplementationStack {
    public static class stack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;
            size++; 
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.val;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if(head == null){
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.val;
            return x;
        }
        boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }
        void display(){
            displayRec(head);
        }
        void displayRec(Node h){
            if (h==null){
                return;
            }
            displayRec(h.next);
            System.out.print(h.val+" ");
        }

        public static void main(String[] args) {
            stack st =new stack();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            System.out.println(st.size());
            System.out.println(st.peek());
            st.display();
            System.out.println();
            st.pop();
            st.display();
            st.isEmpty();
            System.out.println(st.peek());
        }
    }
}
