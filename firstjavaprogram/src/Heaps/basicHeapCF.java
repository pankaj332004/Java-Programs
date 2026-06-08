package Heaps;

import java.util.PriorityQueue;

public class basicHeapCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
        pq.add(2);
        System.out.println(pq);
        pq.add(10);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.add(4);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
    }
}
