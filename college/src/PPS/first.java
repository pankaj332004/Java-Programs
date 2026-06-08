
    package PPS;

import java.util.Scanner;

    public class first {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            String[][] arr = new String[n][m];

            // Input (row by row, space-separated)
            for(int i=0;i<n;i++){
                String[] row = sc.nextLine().split(" ");
                for(int j=0;j<m;j++){
                    arr[i][j] = row[j];
                }
            }

            // Output: lengths of first & last column
            for(int i=0;i<n;i++){
                System.out.print(arr[i][0].length() + " " + arr[i][m-1].length());
                System.out.println();
            }
        }
    }

