package setANDhashmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ASTMutuals {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();


        Set<Integer> arr = new HashSet<>();
        for(int i=0;i<p;i++){
            arr.add(sc.nextInt());
        }
        Set<Integer> brr = new HashSet<>();
        for(int i=0;i<q;i++){
            brr.add(sc.nextInt());
        }
        Set<Integer> crr = new HashSet<>();
        for(int i=0;i<r;i++){
            crr.add(sc.nextInt());
        }

        Set<Integer> inter = new HashSet<>(arr);
        inter.removeAll(brr);
        inter.retainAll(crr);

        System.out.println(inter.size());
    }
}
