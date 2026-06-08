package LOOP;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        // used for repetition of code
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for( int i=0;i<n;i++){
            System.out.println( i+1 +" HELLO WORLD !");
        }

        // how for loop work
        // syntax
        // for(initialization: condition : increment ){
        //   statement to be work ( body of the loop )
        // }

        // steps
        // 1. initialization
        // 2. condition
        // 3. body of the loop
        // 4. increment
        // 5. if condition false
        // 6. loop will break

    }
}
