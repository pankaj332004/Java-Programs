package PPS;

import java.util.Scanner;

public class CompressRecurrences {
    public  static void compression(String s , int n) {
        String ans="";
        int count=1;

        for(int i=1;i<s.length();i++){
            if(i<s.length() && s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                if(count>=n){
                    ans+=s.charAt(i-1)+String.valueOf(count);

                }else{
                    for(int j=0;j<count;j++){
                        ans+=s.charAt(i-1);
                    }
                    count=1;
                }
            }
        }
        if(count>=n){
            ans+=s.charAt(s.length()-1)+String.valueOf(count);
        }
        System.out.print(ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();

        compression(s,n);
    }
}
