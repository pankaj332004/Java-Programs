package Queue;

public class arrayImplementationOfQueue {
    public static  class queue{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr = new int[10];

        public void  add(int val){
            if(r==arr.length-1){
                System.out.println("queue is full");
                return;
            }
            if(f==-1 && r==-1){
                f=r=0;
                arr[r]=val;
            }else{
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            // check underflow
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[f++];
            size--;
            return val;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }return arr[f];
        }
        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
            }else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        public int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        queue que = new queue();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.add(60);
        que.add(70);
        que.add(80);
        que.add(90);
        que.add(100);
        que.display();
        System.out.println(que.remove());
        System.out.println(que.size());
        System.out.println(que.peek());
    }
}
