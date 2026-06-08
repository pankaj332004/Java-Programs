package ARRAY_ARRAYLIST.Arraylist;

import java.util.ArrayList;

public class basicsOFarraylist {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3};
        //double[] brr = {3, 14, 2, 87, 5, 6};
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10); //arr[0]
        arr.add(1,20); //initialise
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){ //instead of arr.length we use arr.size()
            System.out.print(arr.get(i)+" ");// arr[i] print
        }
        System.out.println();
        arr.set(2,35); //modify or change
        for(int i=0;i<=5;i++){
            System.out.print(arr.get(i) +" "); // arr[i] print
        }
        arr.add(90); // add at the last in the array or push back
        System.out.print("\n"+arr.size());
        System.out.print("\n"+arr+" ");
    }
}
