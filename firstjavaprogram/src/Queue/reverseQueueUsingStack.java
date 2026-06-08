package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverseQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        que.add(5);
        que.add(4);
        que.add(3);
        que.add(2);
        que.add(1);
        System.out.println(que);
        while(!que.isEmpty()) {
            st.push(que.remove());
        }
        while (!st.isEmpty()){
            que.add(st.pop());
        }
        System.out.println(que);
    }
}
