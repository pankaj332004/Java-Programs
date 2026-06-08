package Mergesort;

public class  mergeTwoSortedArrays {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] <b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
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
    public static void main(String[] args) {
        int[] a={10,30,50,70,90};
        int[] b={20,40,60,80};
        print(a);
        print(b);
        int[] c = new int[a.length+b.length];
        merge(a,b,c);
        print(c);
    }
}
