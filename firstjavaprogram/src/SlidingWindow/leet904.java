package SlidingWindow;

import java.util.HashMap;

public class leet904 {
    public static void main(String[] args) {
        int[] arr={1,0,1,4,1,4,1,2,3,2,2};
        int x = totalFruit(arr);
        System.out.println(x);
    }
    public static int totalFruit(int[] fruits) {
        int n= fruits.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int start=0;
        int maxLen=0;
        for(int end=0;end<n;end++){
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);

            while(map.size()>2){
                map.put(fruits[start],map.get(fruits[start])-1);

                if(map.get(fruits[start])==0){
                    map.remove(fruits[start]);
                }
                start++;
            }
            maxLen = Math.max(maxLen,end-start+1);
        }
        return maxLen;
    }
}
