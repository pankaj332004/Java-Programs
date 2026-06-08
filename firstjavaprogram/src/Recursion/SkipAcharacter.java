package Recursion;

public class SkipAcharacter {
    public static void Skip(int i , String s ,String ans){
        if(i==s.length()) {
            System.out.print(ans);
            return;
        }
        if(s.charAt(i)!='a') ans += s.charAt(i);
        Skip(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s = "Pankaj Kumar Rajbhar";
        Skip(0,s,"");

    }
}
