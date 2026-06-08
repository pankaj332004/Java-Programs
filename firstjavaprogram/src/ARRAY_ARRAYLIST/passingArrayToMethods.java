package ARRAY_ARRAYLIST;

public class passingArrayToMethods {
//    public static void main(String[] args) {
//        int x=5;
//        System.out.println(x);
//        change(x); // pass by value
//        System.out.println(x);
//    }
//
//    public static void change(int x) {
//        x=10;
//    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(arr[0]);
        change(arr); // pass by reference
        System.out.println(arr[0]);
    }

    public static void change(int[] x) {
        x[0] = 90;
    }
}
