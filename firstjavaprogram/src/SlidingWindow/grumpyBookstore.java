package SlidingWindow;

public class grumpyBookstore {
    public static void main(String[] args) {
        int[] cust={1,0,1,2,1,1,7,5};
        int[] grump={0,1,0,1,0,1,0,1};
        int cus=3;
        int x=maxSatisfied(cust , grump , cus);
        System.out.println(x);

    }
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//        int unsatisfied=0;
//        int n=customers.length;
//        int i=0,j=minutes-1;
//        int maxUnsatisfied=0;
//        int a=i,b=j;
//        for(int x =i;x<=j;x++){
//            if(grumpy[x]==1) unsatisfied+=customers[i];
//        }
//        while(j<n){
//            if(maxUnsatisfied<unsatisfied){
//                maxUnsatisfied=unsatisfied;
//                a=i;b=j;
//            }
//            i++; j++;
//            if(j<n && grumpy[j]==1) unsatisfied+=customers[j];
//            if(grumpy[i-1]==1) unsatisfied-=customers[i-1];
//        }
//        for(int x=a;x<=b;x++){
//            grumpy[x]=0;
//        }
//        int satisfied = 0;
//        for(int x=0;x<n;x++){
//            if(grumpy[x]==0) satisfied+=customers[x];
//        }
//        return satisfied;
        int n = customers.length;
        int baseSatisfied = 0;

        // Step 1: Customers already satisfied
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                baseSatisfied += customers[i];
            }
        }

        // Step 2: Sliding window for extra satisfied customers
        int extra = 0;

        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }

        int maxExtra = extra;

        for (int i = minutes; i < n; i++) {

            if (grumpy[i] == 1)
                extra += customers[i];

            if (grumpy[i - minutes] == 1)
                extra -= customers[i - minutes];

            maxExtra = Math.max(maxExtra, extra);
        }

        return baseSatisfied + maxExtra;
    }
}
