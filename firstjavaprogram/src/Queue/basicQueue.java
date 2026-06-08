package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class basicQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        Queue<Integer> helper = new ArrayDeque<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        que.add(7);
        que.add(8);
        que.add(9);
        System.out.println(que);
        while (que.size()>0){
            System.out.print(que.peek()+" , ");

            helper.add(que.poll());
        }
        System.out.println();
        System.out.println(helper);
        while (helper.size()>0){
            que.add(helper.poll());
        }
        System.out.println(que);
    }
}
