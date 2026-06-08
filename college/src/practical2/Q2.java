package practical2;

public class Q2 {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            int countrow = 0;
            for (int j = 0; j < m; j++) {
                countrow = countrow+arr[i][j];
            }
            System.out.println("Sum of row "+(i+1) +" is " +countrow);
            System.out.println("Average of row "+ (i+1) +" is " +countrow/m);
        }
        for (int j = 0; j < m; j++) {
            // Initialize sum for the current column
            int sum = 0;

            // Iterate through each row in the current column
            for (int i = 0; i < n; i++) {
                sum += arr[i][j];
            }

            // Store the sum in the columnSums array
            System.out.println("Sum of " + (j+1)+ " column is "+sum);
            System.out.println("Average of "+(j+1)+" column is "+sum/n);
        }
    }
}
