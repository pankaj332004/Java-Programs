package ARRAY_ARRAYLIST;

import java.util.Scanner;

public class basic_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // array store data
        // algorithm is steps to solve the given problem
        // it is the simple and basic dsa
        // if I have to store a collection of same datatypes variable
        // then I use array

        // syntax of array
        // not an array  single  number int x;
        // an array manny number  int[] y=new int[100]
        // array indexing
        // y[0]=10;
        // y[1]=20;
        // y[2]=30;
        // y[3]=40;
        // y[4]=50;
        // print
        // System.out.println(y[0]);
        int[] arr=new int[5];
        // initializing
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        // print output of the array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // updating an element
        arr[0]+=15;
        System.out.println(arr[0]);
    }
}
