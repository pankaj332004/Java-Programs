package Recursion;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 12131;
        int ans = reverse(n,0);
        System.out.println(ans);
    }
    public static int reverse(int n, int r){
        if(n==0) return r;
        return reverse(n/10, r*10+n%10);
    }
}
