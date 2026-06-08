package ARRAY_ARRAYLIST;

public class sort_of_0_1and2 {
    public static void main(String[] args) {
        // Dutch flag algorithm

        int[] arr = {0, 1, 2, 0, 1, 2, 1, 1, 0, 2, 0, 1, 0, 2, 2, 2};
        int n=arr.length;
        // method 1 two pass solution
//        int noOFzeros = 0;
//        int noOfones = 0;
//        for(int i=0;i<n;i++){
//            if(arr[i] == 0) noOFzeros++;
//            else noOfones++;
//        }
//        for(int i=0;i<n;i++){
//            if(i<noOFzeros) arr[i] = 0;
//            else if (i<noOFzeros+noOfones)  arr[i]=1;
//            else arr[i]=2;
//        }

        // method 2 dutch flag algorithm
        int mid = 0, hi = n-1, lo = 0;
        while(mid<=hi){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++; mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{ // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
