package TCS;

import java.util.*;

public class EnthusiasticVijay {

    private static final Map<String, Character> PATTERN_TO_DIGIT = new HashMap<>();
    private static final Map<Character, String> DIGIT_TO_PATTERN = new HashMap<>();

    private static void initializePatterns() {
        String[] patterns = {
                "111101111", // 0
                "001001001", // 1
                "111010111", // 2
                "111011011", // 3
                "101111001", // 4
                "110111011", // 5
                "110111111", // 6
                "111001001", // 7
                "111111111", // 8
                "111111011"  // 9
        };
        for (int i = 0; i <= 9; i++) {
            PATTERN_TO_DIGIT.put(patterns[i], (char) ('0' + i));
            DIGIT_TO_PATTERN.put((char) ('0' + i), patterns[i]);
        }
    }

    private static int getHammingDistance(String s1, String s2) {
        int distance = 0;
        for (int i = 0; i < 9; i++) {
            if (s1.charAt(i) != s2.charAt(i)) distance++;
        }
        return distance;
    }

    private static String decodeNumber(List<String> lines) {
        if (lines.size() < 3) return "";
        StringBuilder result = new StringBuilder();
        int width = lines.get(0).length();

        for (int i = 0; i < width; i += 3) {
            StringBuilder pattern = new StringBuilder();
            for (int r = 0; r < 3; r++) {
                String row = lines.get(r);
                for (int c = 0; c < 3; c++) {
                    if (i + c < row.length()) {
                        char ch = row.charAt(i + c);
                        pattern.append(ch == ' ' ? '0' : '1');
                    } else {
                        pattern.append('0');
                    }
                }
            }
            Character digit = PATTERN_TO_DIGIT.get(pattern.toString());
            if (digit == null) {
                System.err.println("Unrecognized pattern: " + pattern);
                return "";
            }
            result.append(digit);
        }
        return result.toString();
    }

    private static String findModifiedNumber(String number, int k) {
        char[] digits = number.toCharArray();
        int n = digits.length;
        int toggles = 0;

        while (toggles < k) {
            boolean changed = false;
            String bestNumber = new String(digits);
            int bestIndex = -1;
            char bestReplacement = ' ';

            for (int i = 0; i < n; i++) {
                char orig = digits[i];
                String origPattern = DIGIT_TO_PATTERN.get(orig);
                for (char cand = '0'; cand <= '9'; cand++) {
                    if (cand == orig) continue;
                    String candPattern = DIGIT_TO_PATTERN.get(cand);
                    if (getHammingDistance(origPattern, candPattern) == 1) {
                        char[] temp = digits.clone();
                        temp[i] = cand;
                        String candidate = new String(temp);
                        if (candidate.compareTo(bestNumber) < 0) {
                            bestNumber = candidate;
                            bestIndex = i;
                            bestReplacement = cand;
                            changed = true;
                        }
                    }
                }
            }

            if (!changed) break;
            digits[bestIndex] = bestReplacement;
            toggles++;
        }
        return new String(digits);
    }

    private static String nextAnagram(String s) {
        char[] arr = s.toCharArray();
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        if (i < 0) return s;
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) j--;
        swap(arr, i, j);
        reverse(arr, i + 1, arr.length - 1);
        return new String(arr);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) swap(arr, start++, end--);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializePatterns();

        List<String> lines = new ArrayList<>();
        for (int i = 0; i < 3; i++) lines.add(sc.nextLine());

        String kLine = "";
        while (sc.hasNextLine()) {
            kLine = sc.nextLine().trim();
            if (!kLine.isEmpty()) break;
        }
        int k = Integer.parseInt(kLine);

        String original = decodeNumber(lines);
        if (original.isEmpty()) {
            System.err.println("Failed to decode number!");
            return;
        }

        String modified = findModifiedNumber(original, k);
        String next = nextAnagram(modified);

        java.math.BigInteger origNum = new java.math.BigInteger(original);
        java.math.BigInteger nextNum = new java.math.BigInteger(next);
        System.out.println(nextNum.subtract(origNum).abs());
    }
}
