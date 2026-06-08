package STACK;

import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(5);
        st.push(9);
        System.out.println(st+" ");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.push(10);
        st.push(20);
        while(st.size()>1){
            st.pop();
        }
        // now size has become 1
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
