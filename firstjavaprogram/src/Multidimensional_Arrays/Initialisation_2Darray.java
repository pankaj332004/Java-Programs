package Multidimensional_Arrays;

public class Initialisation_2Darray {
    public static void main(String[] args) {
        int[][] arr={{1234,56},{1256,43},{1434,32},{1312,96}};
        int n= arr.length;
        int m=arr[0].length;
        // output through nested loop
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
        // output through for each loop
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
