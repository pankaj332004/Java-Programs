package setANDhashmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MutualUncommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] brr = new int[m];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            brr[i] = sc.nextInt();
        }

        Set<Integer> P = new HashSet<>();
        Set<Integer> Q = new HashSet<>();
        for(int i=0;i<n;i++){
            P.add(arr[i]);
        }
        for(int i=0;i<m;i++){
            Q.add(brr[i]);
        }
        Set<Integer> R = new HashSet<>(P);
        R.removeAll(Q);

        Set<Integer> S = new HashSet<>(Q);
        S.removeAll(P);
        System.out.println(R.size() * S.size());

    }
}
