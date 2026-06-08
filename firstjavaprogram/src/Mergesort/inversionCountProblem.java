package Mergesort;

public class inversionCountProblem {
    static int count=0;
//    public static void print(int[] arr){
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//    public static void inversion(int[] a, int[] b){
//        int i=0,j=0;
//        while(i<a.length && j<b.length){
//            if(a[i] > b[j]){
//                count +=(a.length-i);
//                j++;
//            }
//            else{
//                i++;
//            }
//        }
//    }
//    public static void merge(int[] a, int[] b, int[] c){
//        int i=0, j=0, k=0;
//        while(i<a.length && j<b.length){
//            if(a[i] <b[j]){
//                c[k] = a[i];
//                i++;
//                k++;
//            }
//            else{
//                c[k]=b[j];
//                j++;
//                k++;
//            }
//        }
//        if(i==a.length){
//            while(j<b.length){
//                c[k] = b[j];
//                j++;
//                k++;
//            }
//        }
//        if(j==b.length){
//            while(i<a.length){
//                c[k] = a[i];
//                k++;
//                i++;
//            }
//        }
//    }
//    public static void merge_Sort(int[] arr){
//        int n = arr.length;
//        if(n==1) return;;
//        // create two arrays of n/2 size each
//        int[] a = new int[n/2];
//        int[] b = new int[n-n/2];
//        //copy and pasting
//        for(int i=0;i<n/2;i++){
//            a[i] = arr[i];
//        }
//        for(int i=0;i<n-n/2;i++){
//            b[i] = arr[i+n/2];
//        }
//        // magic
//        merge_Sort(a);
//        merge_Sort(b);
//        // merge these a and b
//        inversion(a,b);
//        merge(a , b , arr);
//
//    }
//    public static void main(String[] args) {
//        int[] arr = {80,30,50,60,40,90,70,10,20};
//        print(arr);
//        merge_Sort(arr);
//        print(arr);
//        System.out.println(count);
//    }


    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
//    public static void inversion(int[] a, int[] b){
//        int i=0,j=0;
//        while(i<a.length && j<b.length){
//            if(a[i] > b[j]){
//                count +=(a.length-i);
//                j++;
//            }
//            else{
//                i++;
//            }
//        }
//    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] <b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{//a[i] > b[j]
                count += (a.length-i);
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){
            while(j<b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k] = a[i];
                k++;
                i++;
            }
        }
    }
    public static void merge_Sort(int[] arr){
        int n = arr.length;
        if(n==1) return;;
        // create two arrays of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        //copy and pasting
        for(int i=0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        // magic
        merge_Sort(a);
        merge_Sort(b);
        // merge these a and b
        //inversion(a,b);
        merge(a , b , arr);

    }
    public static void main(String[] args) {
        int[] arr = {80,30,50,60,40,90,70,10,20};
        print(arr);
        merge_Sort(arr);
        print(arr);
        System.out.println(count);
    }
}
