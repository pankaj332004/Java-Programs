package STACK;

public class ArrayImplementation {
    public static  class stack{
        private  int[] arr = new int[5];
        private int idx = 0;
        void push(int x){
            if(isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx] =x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("the stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(arr.length == idx){
                return true;
            }
            return false;
        }
        void pop(){
            if(idx <0){
                System.out.println("Pop operation can not be perform");
            }
            else{
                System.out.println(arr[idx-1]);
                idx--;
            }
        }
    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        st.display();
        st.pop();
        System.out.println(st.size());
        st.display();
        st.push(60);
        System.out.println(st.isFull());
        st.push(70);
    }
}
