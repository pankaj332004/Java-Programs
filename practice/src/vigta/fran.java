package vigta;

import java.util.*;

public class fran {
    static Map<String, List<List<String>>> recipes = new HashMap<>();
    static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            if (!line.contains("=")) continue; // safeguard

            String[] parts = line.split("=");
            String potion = parts[0].trim();
            String[] ingredients = parts[1].split("\\+");

            recipes.putIfAbsent(potion, new ArrayList<>());
            List<String> ingredientList = new ArrayList<>();
            for (String ing : ingredients) {
                ingredientList.add(ing.trim());
            }
            recipes.get(potion).add(ingredientList);
        }

        // Last line = target potion
        String target = sc.nextLine().trim();
        sc.close();

        int result = getCost(target);
        System.out.println(result);
    }

    // Recursive function with memoization
    static int getCost(String potion) {
        // If it's not in recipes, it's an item → cost 0
        if (!recipes.containsKey(potion)) {
            return 0;
        }

        // If already computed
        if (memo.containsKey(potion)) {
            return memo.get(potion);
        }

        int minCost = Integer.MAX_VALUE;
        for (List<String> ingList : recipes.get(potion)) {
            int cost = ingList.size() - 1;
            for (String ing : ingList) {
                cost += getCost(ing);
            }
            minCost = Math.min(minCost, cost);
        }

        memo.put(potion, minCost);
        return minCost;
    }
}
