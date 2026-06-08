package Heaps;

import java.util.NoSuchElementException;

class MaxHeap{
    int[] arr;
    int size;
    MaxHeap(int capacity){
        arr = new int[capacity];
        size=0;
    }
    public void add(int n) throws Exception{
        if (size == arr.length) {
            throw new IllegalStateException("Heap capacity exceeded");
        }
        arr[size++]=n;
        upHeapify(size-1);
    }
    public void upHeapify(int idx){
        if(idx==0) return;
        int parent = (idx-1)/2;
        if(arr[idx]>arr[parent]){
            swap(idx,parent);
            upHeapify(parent);
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
        if(size==0) throw new NoSuchElementException("Heap is Empty");
        return arr[0];
    }
    public int remove(){
        if(size==0) throw  new NoSuchElementException("Heap is Empty");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int idx){
        if(idx >=size )return;
        int left = 2*idx+1;
        int right = 2*idx+2;
        int maxidx = idx;

        if(left < size && arr[maxidx]<arr[left]) maxidx=left;
        if(right < size && arr[maxidx] < arr[right]) maxidx=right;
        if(idx == maxidx) return;
        swap(idx,maxidx);
        downHeapify(maxidx);
    }
}
public class maxHeapImplementationByArr {
    public static void main(String[] args) throws  Exception {
        MaxHeap pq = new MaxHeap(5);
        pq.add(10);
        pq.add(5);
        pq.add(20);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.size());
        pq.add(40);
        pq.add(56);
        pq.add(70);
        pq.add(80);
        System.out.println(pq.size());

    }
}
