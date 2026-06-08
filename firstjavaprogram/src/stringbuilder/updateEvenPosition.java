package stringbuilder;

import javax.xml.transform.Source;
import java.util.Scanner;

public class updateEvenPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        String str="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                str +='a';
            }
            else str += s.charAt(i);
        }
        s=str;
        System.out.println(s);
    }
}
