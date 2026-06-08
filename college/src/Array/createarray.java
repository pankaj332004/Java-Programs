package Array;

public class createarray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int arr2[] = {3,4,5,6,7};
        int arr3[][] = new int[2][2];
        int arr4[][] = {{1,5},{6,7}};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i< arr2.length;i++){
            System.out.print(arr2[i]);
        }
        for(int i=0;i< arr4.length;i++) {
            for (int j = 0; j <= 1; j++) {


                System.out.print(arr4[i][j]);
            }
        }
        for (int i=0;i< arr4.length;i++){
            System.out.print(arr4[i]);
        }
    }
}