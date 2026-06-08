/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
package PPS;
import java.util.*;
public class palindromeAndReverse
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();

        StringBuilder str1=new StringBuilder(s1.substring(0,s1.length()/2));
        StringBuilder str2=new StringBuilder(s1.substring((s1.length()/2)));

        str1=str1.reverse().append(str2.reverse());

        int i=0;
        int j=str1.length()-1;
        boolean found=true;
        while(i<j){
            if(str1.charAt(i)!=str1.charAt(j)){
                found=false;
            }
            i++;
            j--;
        }
        if(!found){
            System.out.print("False");
        }else{
            System.out.print("True");
        }

    }
}