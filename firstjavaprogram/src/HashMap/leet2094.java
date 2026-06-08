package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class leet2094 {
    public static int[] findEvenNumbers(int[] digits) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ele : digits){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else{
                map.put(ele,1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=100;i<999;i+=2){
            int x=i;
            int c = x%10; x=x/10;
            int b = x%10; x=x/10;
            int a = x;
            if(map.containsKey(a)){
                int aFreq = map.get(a);
                map.put(a,aFreq-1);
                if(aFreq==1) map.remove(a);
                if(map.containsKey(b)){
                    int bFreq = map.get(b);
                    map.put(b,bFreq-1);
                    if(bFreq==1) map.remove(b);
                    if(map.containsKey(c)){
                        list.add(i);
                    }
                    map.put(b,bFreq);
                }
                map.put(a,aFreq);
            }
        }
        int[] nums = new int[list.size()];
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,0};
        System.out.println(Arrays.toString(findEvenNumbers(arr)));

    }
}
