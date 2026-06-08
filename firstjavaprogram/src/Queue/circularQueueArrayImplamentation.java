package Queue;

public class circularQueueArrayImplamentation {
    public static class Cqa{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val){
            if(size==0){
                front=rear=0;
            }
            else if(size==arr.length){
                System.out.println("Queue is full");
                return;
            }else {
                rear = (rear + 1)%arr.length;
            }
            arr[rear] = val;
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = arr[front];
            front = (front + 1)%arr.length;
            size--;
            if(size==0){
                front = rear = -1;
            }
            return x;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            } int  i = front;
            for (int count = 0; count < size; count++){
                System.out.print(arr[i]+" ");
                i = (i + 1)%arr.length;
            }
            System.out.println();
        }
        public  boolean isEmpty(){
            return size==0;
        }
        public  int  size(){
            return size;
        }
    }
    public static void main(String[] args) {
        Cqa q = new Cqa();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();

        q.remove();
        q.remove();
        q.display();

        System.out.println(q.isEmpty());
        System.out.println(q.size());

        q.add(6);
        q.add(7);
        q.display();
        q.add(8);

        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
    }
}
