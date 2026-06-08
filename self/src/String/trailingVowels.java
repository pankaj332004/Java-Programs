package String;

public class trailingVowels {
    public static String trimTrailingVowels(String s) {
        int i= s.length()-1;
        while(i>=0 && isVowel(s.charAt(i))){
            i--;
        }
        return s.substring(0,i+1);
    }
    private static boolean isVowel(char c) {
        boolean flag = false;
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            flag=true;
        }
        return flag;
    }

    public static void main(String[] args) {
        String s = "idea";
        System.out.println(trimTrailingVowels(s));
    }
}
