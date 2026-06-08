package Queue;

public class dequeuedll {
    static  class Node{
        int data;
        Node prev, next;
        Node(int data){
            this.data  = data;
            this.prev =null;
            this.next = null;
        }
    }
    static class deque{
        Node front;
        Node rear;
        int size;
        deque(){
            front = rear = null;
            size = 0;
        }
        boolean isEmpty(){
            return size==0;
        }
        int size(){
            return size;
        }
        void insertFront(int data){
            Node newNode = new Node(data);
            if(front==null){
                rear = front = newNode;
            }
            else{
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }
            size++;
        }
        void insertRear(int data){
            Node newNode =new Node(data);
            if(rear==null){
                front=rear=newNode;
            }else{
                newNode.prev = rear;
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }
        void deleteFront(){
            if(size==0){
                System.out.println("Deque is Empty");
            }
            else{
                Node temp = front;
                front = front.next;
                if(front==null){
                    rear = null;
                }
                else{
                    front.prev=null;
                }
                size--;
            }
        }
        void deleteRear(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            else{
                Node temp = rear;
                rear=rear.prev;
                if(rear==null){
                    front=null;
                }else{
                    rear.next=null;
                }
                size--;
            }
        }
        int getFront(){
            if(size==0){
                System.out.println("Underflow");
                return -1;
            }
            return front.data;
        }
        int getRear(){
            if(size==0){
                System.out.println("Underflow");
                return -1;
            }
            return rear.data;
        }
        void display(){
            if(front==null){
                System.out.println("Deque is empty");
                return;
            }
            Node temp = front;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        deque dq=new deque();
        System.out.println("Insertint 5 at rear end");
        dq.insertRear(5);
        System.out.println("Insertint 10 at rear end");
        dq.insertRear(10);
        System.out.println("Rear end element "+ dq.getRear());

        System.out.println("Inserting 3 at front end");
        dq.insertFront(3);
        System.out.println("Front end element: " + dq.getFront());

        dq.deleteFront();
        System.out.println("After deleting front, new front: " + dq.getFront());

        dq.deleteRear();
        System.out.println("After deleting rear, new rear: " + dq.getRear());

        dq.insertRear(15);
        dq.insertRear(20);
        dq.insertRear(25);
        dq.display();
        System.out.println(dq.isEmpty());
        System.out.println(dq.size());
    }
}


//package Queue;
//
//public class dequeuedll {
//    static class Node {
//        int data;
//        Node prev, next;
//
//        Node(int data) {
//            this.data = data;
//            this.prev = null;
//            this.next = null;
//        }
//    }
//
//    static class deque {
//        Node front;
//        Node rear;
//        int size;
//
//        deque() {
//            front = rear = null;
//            size = 0;
//        }
//
//        boolean isEmpty() {
//            return size == 0;
//        }
//
//        int size() {
//            return size;
//        }
//
//        void insertFront(int data) {
//            Node newNode = new Node(data);
//            if (front == null) {
//                rear = front = newNode;
//            } else {
//                newNode.next = front;
//                front.prev = newNode;
//                front = newNode;
//            }
//            size++;
//        }
//
//        void insertRear(int data) {
//            Node newNode = new Node(data);
//            if (rear == null) {
//                front = rear = newNode;
//            } else {
//                newNode.prev = rear;
//                rear.next = newNode;
//                rear = newNode;
//            }
//            size++;
//        }
//
//        void deleteFront() {
//            if (size == 0) {
//                System.out.println("Deque is Empty");
//            } else {
//                front = front.next;
//                if (front == null) {
//                    rear = null;
//                } else {
//                    front.prev = null;
//                }
//                size--;
//            }
//        }
//
//        void deleteRear() {
//            if (size == 0) {
//                System.out.println("Deque is Empty");
//            } else {
//                rear = rear.prev;
//                if (rear == null) {
//                    front = null;
//                } else {
//                    rear.next = null;
//                }
//                size--;
//            }
//        }
//
//        int getFront() {
//            if (size == 0) {
//                System.out.println("Underflow");
//                return -1;
//            }
//            return front.data;
//        }
//
//        int getRear() {
//            if (size == 0) {
//                System.out.println("Underflow");
//                return -1;
//            }
//            return rear.data;
//        }
//    }
//
//    public static void main(String[] args) {
//        deque dq = new deque();
//        System.out.println("Inserting 5 at rear end");
//        dq.insertRear(5);
//        System.out.println("Inserting 10 at rear end");
//        dq.insertRear(10);
//        System.out.println("Rear end element: " + dq.getRear());
//
//        System.out.println("Inserting 3 at front end");
//        dq.insertFront(3);
//        System.out.println("Front end element: " + dq.getFront());
//
//        dq.deleteFront();
//        System.out.println("After deleting front, new front: " + dq.getFront());
//
//        dq.deleteRear();
//        System.out.println("After deleting rear, new rear: " + dq.getRear());
//    }
//}
