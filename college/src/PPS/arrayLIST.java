package PPS;

import java.util.ArrayList;

public class arrayLIST {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.add(60);
        arr.add(0,0);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        
    }
}
