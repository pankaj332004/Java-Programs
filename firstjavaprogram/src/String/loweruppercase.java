package String;

import java.util.Locale;

public class loweruppercase {
    public static void main(String[] args) {
        String s = "Pankaj Kumar Rajbhar  is 22 year old";
        System.out.println(s.toLowerCase());//not affect the string
        System.out.println(s.toUpperCase());
       // s=s.toLowerCase(); // affect the string
       String a= "ABC";
       String b= "XYZ";
        System.out.println(a.concat(b)); // nothing will change
         //  a= a.concat(b); // change the string
        String x = "  ";
        System.out.println(x);
    }
}
