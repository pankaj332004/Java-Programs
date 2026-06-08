package Heaps;

import java.util.NoSuchElementException;

class MinHeap{
    private int[] arr;
    private int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int n){
        arr[size++]=n;
        upheapify(size-1);
    }
    public void upheapify(int idx){
        if(idx==0) return;
        int parent = (idx-1)/2;
        if(arr[idx]<arr[parent]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int size(){
        return size;
    }
    public int peek() throws Exception{
        if(size == 0) throw new NoSuchElementException("Heap is Empty");
        return arr[0];
    }
    public int remove() throws Exception{
        if (size==0) throw new NoSuchElementException("Heap is Empty");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int idx){
        if(idx >=size )return;
        int lc = 2*idx+1, rc = 2*idx+2;

        int minidx = idx;
        if(lc<size && arr[minidx]> arr[lc]) minidx=lc;
        if(rc<size && arr[minidx]> arr[rc]) minidx=rc;
        if(idx == minidx) return;
        swap(idx,minidx);
        downHeapify(minidx);
    }
}
public class minHeapImplementationByArr {
    public static void main(String[] args) throws  Exception{
        MinHeap pq = new MinHeap(10);
        pq.add(1);
        pq.add(2);
        pq.add(3);
        System.out.println(pq.remove());
        pq.add(0);
        pq.add(6);
        pq.add(-4);
        System.out.println(pq.peek()+" "+pq.size());

    }
}
