package TCS;
import java.util.*;

public class OrderIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine().trim());
        sc.nextLine(); // consume "shuffled"

        List<String> shuffled = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            shuffled.add(sc.nextLine().trim().toLowerCase());
        }

        sc.nextLine(); // consume "original"

        List<String> original = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            original.add(sc.nextLine().trim().toLowerCase());
        }

        // Map each instruction in original to its index
        Map<String, Integer> pos = new HashMap<>();
        for (int i = 0; i < N; i++) {
            pos.put(original.get(i), i);
        }

        int[] mapped = new int[N];
        for (int i = 0; i < N; i++) {
            Integer val = pos.get(shuffled.get(i));
            if (val == null) {
                System.err.println("❌ Instruction mismatch: " + shuffled.get(i));
                return;
            }
            mapped[i] = val;
        }

        // Count consecutive increasing runs
        int runs = 1;
        for (int i = 1; i < N; i++) {
            if (mapped[i] != mapped[i - 1] + 1) {
                runs++;
            }
        }

        int operations = runs - 1;
        System.out.println(operations-1);
    }
}
