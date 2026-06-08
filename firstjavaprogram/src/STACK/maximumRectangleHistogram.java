package STACK;

import java.util.Stack;

public class maximumRectangleHistogram {
    public static int largestRectanleArea(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        int[] leftSmall = new int[n];
        int[] rightSmall = new int[n];

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) leftSmall[i] = 0;
            else leftSmall[i] = st.peek()+1;
            st.push(i);
        }

        while(!st.isEmpty()) st.pop();

        for(int i=n-1; i>=0 ;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) rightSmall[i]=n-1;
            else rightSmall[i]=st.peek()-1;
            st.push(i);
        }

        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxArea = Math.max(maxArea,arr[i]*(rightSmall[i]-leftSmall[i]+1));
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int result = largestRectanleArea(arr);
        System.out.println(result);
    }
}
