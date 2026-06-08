package HashMap;

import java.util.HashSet;

public class leet1497 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,6,7,8,9};
        int k = 5;

        int count=0;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            int remain = Math.abs(k-ele);
            if(set.contains(remain) && (ele+remain)%k==0){
                count++;
            }
            set.add(ele);
        }

    }
}
