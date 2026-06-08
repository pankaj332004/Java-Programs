package SlidingWindow;

import java.util.HashMap;

public class leet1248 {
    public static void main(String[] args) {
        int[] arr ={2,2,2,1,2,2,1,2,2,2};
        int k=2;
        int x = numberOfSubarrays(arr , k);
        System.out.println(x);
    }
    public static int numberOfSubarrays(int[] arr, int k) {
        // method 1
//        int i=0,j=0,a=0,b=0,n=arr.length, k2=0;
//        int count = 0;
//        while(i<n && arr[i]%2==0) i++;
//        while(j<n && k2<k) if(arr[j++]%2!=0) k2++;
//        if(k2<k) return 0;
//        j--;
//        b=j+1;
//        while(b<n && arr[b]%2==0) b++;
//        b--;
//        while(b<n){ // sliding window 4 variable sliding window
//            count += (i-a+1)*(b-j+1);
//            a=i+1;
//            i++;
//            while(i<n && arr[i]%2==0) i++;
//            j=b+1;
//            b=j+1;
//            while(b<n && arr[b]%2==0) b++;
//            b--;
//        }
//        return count;


        // method 2
        int n=arr.length, count=0;
        for(int i=0;i<n;i++) arr[i] %= 2;
        for(int i=1;i<n;i++) arr[i] += arr[i-1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],i);
            int a=0;
            if(map.containsKey(arr[i]-k)) a=map.get(arr[i]-k);
            int b=0;
            if(map.containsKey(arr[i]-k+1)) b=map.get(arr[i]-k+1);
            if(arr[i]==k) count += (b-a+1);
            if(arr[i]>k) count += (b-a);
        }
        return count;
    }
}
