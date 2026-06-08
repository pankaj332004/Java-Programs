package Multidimensional_Arrays;

public class sum_of_element {
    public static void main(String[] args) {
        int[][] arr = {{6,9,3},{4,2,8},{4,8,12}};
        int n= arr.length;
        int m=arr[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
