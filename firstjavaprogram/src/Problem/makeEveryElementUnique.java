package Problem;

public class makeEveryElementUnique {
    public static int minIncrementForUnique(int[] arr){
        int n=arr.length;
        int max_value = Integer.MIN_VALUE;
        for(int val: arr){
            max_value=Math.max(max_value,val);
        }
        int[] freq = new int[n+max_value];
        for(int val:arr){
            freq[val]++;
        }
        int inc =0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]<=1) continue;

            int repeat = freq[i]-1;
            freq[i+1] += repeat;
            freq[i] = 1;
            inc += repeat;
        }
        return inc;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,7};

        int n = minIncrementForUnique(arr);
        System.out.println(n);
    }
}
