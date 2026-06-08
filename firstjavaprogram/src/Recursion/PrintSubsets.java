package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsets {
    public static void main(String[] args) {
        String s ="abcd";
        List<String> ans = new ArrayList<>();
        subsets("",ans,s,0);
        System.out.println(ans);
    }
    public static void subsets(String curr ,List<String> ans, String s , int idx){
        if(idx == s.length()){
            ans.add(curr);
            return;
        }
        char ch = s.charAt(idx);
        subsets(curr + ch,ans ,s,idx+1); // pick
        subsets(curr , ans , s , idx+1);
    }
}
