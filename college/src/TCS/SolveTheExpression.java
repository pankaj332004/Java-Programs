package TCS;

import java.util.*;

public class SolveTheExpression {

    // Global map for 7-segment pattern (9-bit String) to Symbol (String: "0"-"9", "OR", "AND", "NOT", "(", ")")
    private static final Map<String, String> PATTERN_TO_SYMBOL = new HashMap<>();

    // Global map for Symbols to their 9-bit binary string (only for digits)
    private static final Map<String, String> DIGIT_TO_BINARY = new HashMap<>();

    // --- MAIN METHOD ---
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. READ AND DECODE MAPPING (Lines 1-6)
        List<String> patternLines = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            patternLines.add(sc.nextLine());
        }

        // Symbols in the order they appear in the input
        String[] allSymbols = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "||", "&&", "!", "(", ")"};

        decodePatterns(patternLines, allSymbols);

        // 2. READ EXPRESSION (Last 3 lines)
        List<String> expressionLines = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            expressionLines.add(sc.nextLine());
        }
        sc.close();

        try {
            // 3. TOKENIZE AND CONVERT TO INFIX EXPRESSION
            List<String> infixTokens = tokenizeAndConvert(expressionLines);

            // 4. EVALUATE USING RPN
            long result = evaluateExpression(infixTokens);

            // 5. OUTPUT
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Error during evaluation: " + e.getMessage());
        }
    }

    // --- USER DEFINED FUNCTION 1: Pattern Decoding ---
    private static void decodePatterns(List<String> patternLines, String[] symbols) {
        // Since there are 15 symbols (0-9, OR, AND, NOT, (, )), and each pattern is 3 lines high,
        // the total width of the input for 15 symbols is 15 * 3 = 45 characters.

        int symbolCount = symbols.length;

        for (int i = 0; i < symbolCount; i++) {
            StringBuilder pattern = new StringBuilder();

            for (int r = 0; r < 3; r++) { // Iterate through the 3 rows
                // Extract the 3x1 column for the current symbol
                String row = patternLines.get(r);

                // Each symbol takes 3 columns (3x3 grid)
                int startCol = i * 3;

                for (int c = 0; c < 3; c++) { // Iterate through the 3 columns
                    char segment = row.charAt(startCol + c);
                    pattern.append((segment == ' ') ? '0' : '1');
                }
            }

            String patternStr = pattern.toString();
            String symbol = symbols[i];

            PATTERN_TO_SYMBOL.put(patternStr, symbol);

            if (symbol.length() == 1 && Character.isDigit(symbol.charAt(0))) {
                DIGIT_TO_BINARY.put(symbol, patternStr); // Store 9-bit binary for digits
            }
        }
    }

    // --- USER DEFINED FUNCTION 2: Tokenization and Conversion to Infix ---
    private static List<String> tokenizeAndConvert(List<String> expressionLines) {
        List<String> tokens = new ArrayList<>();
        StringBuilder currentNumber = new StringBuilder();

        // The width of the expression pattern is the length of the first line
        int expressionWidth = expressionLines.get(0).length();

        for (int i = 0; i < expressionWidth; i += 3) { // Process every 3 columns (1 symbol)
            StringBuilder pattern = new StringBuilder();

            for (int r = 0; r < 3; r++) { // Extract 3x3 pattern
                String row = expressionLines.get(r);

                // Extract 3 columns: i, i+1, i+2
                for (int c = 0; c < 3; c++) {
                    char segment = row.charAt(i + c);
                    pattern.append((segment == ' ') ? '0' : '1');
                }
            }

            String symbol = PATTERN_TO_SYMBOL.get(pattern.toString());

            if (symbol == null) {
                throw new IllegalArgumentException("Unknown 7-segment pattern encountered.");
            }

            if (Character.isDigit(symbol.charAt(0))) {
                currentNumber.append(symbol);
            } else {
                // If we hit an operator/bracket, finalize the current number (if any)
                if (currentNumber.length() > 0) {
                    // Convert multi-digit number to its concatenated binary string
                    tokens.add(numberToBinaryString(currentNumber.toString()));
                    currentNumber.setLength(0); // Clear the number buffer
                }
                tokens.add(symbol);
            }
        }

        // Finalize the last number if the expression ends with one
        if (currentNumber.length() > 0) {
            tokens.add(numberToBinaryString(currentNumber.toString()));
        }

        return tokens;
    }

    // Helper function to concatenate digit binaries
    private static String numberToBinaryString(String number) {
        StringBuilder binary = new StringBuilder();
        for (char digit : number.toCharArray()) {
            binary.append(DIGIT_TO_BINARY.get(String.valueOf(digit)));
        }
        return binary.toString();
    }

    // --- USER DEFINED FUNCTION 3: Expression Evaluation ---
    private static long evaluateExpression(List<String> infixTokens) {
        // 3.1. Shunting-Yard: Convert Infix to RPN
        List<String> rpnTokens = shuntingYard(infixTokens);

        // 3.2. Evaluate RPN
        return evaluateRPN(rpnTokens);
    }

    // Helper function for operator precedence
    private static int getPrecedence(String op) {
        // Highest to lowest: Brackets, NOT, OR, AND
        return switch (op) {
            case "!" -> 3;
            case "||" -> 2;
            case "&&" -> 1;
            default -> 0; // For operands and brackets
        };
    }

    // Shunting-Yard Algorithm implementation
    private static List<String> shuntingYard(List<String> infixTokens) {
        List<String> rpn = new ArrayList<>();
        Stack<String> opStack = new Stack<>();

        for (String token : infixTokens) {
            if (token.matches("[01]+")) { // Operand (Binary String)
                rpn.add(token);
            } else if (token.equals("(")) {
                opStack.push(token);
            } else if (token.equals(")")) {
                while (!opStack.isEmpty() && !opStack.peek().equals("(")) {
                    rpn.add(opStack.pop());
                }
                if (!opStack.isEmpty() && opStack.peek().equals("(")) {
                    opStack.pop(); // Discard '('
                } else {
                    throw new IllegalArgumentException("Mismatched parentheses.");
                }
            } else { // Operator (||, &&, !)
                while (!opStack.isEmpty() && getPrecedence(opStack.peek()) >= getPrecedence(token)) {
                    rpn.add(opStack.pop());
                }
                opStack.push(token);
            }
        }

        while (!opStack.isEmpty()) {
            if (opStack.peek().equals("(")) {
                throw new IllegalArgumentException("Mismatched parentheses.");
            }
            rpn.add(opStack.pop());
        }
        return rpn;
    }

    // RPN Evaluation implementation
    private static long evaluateRPN(List<String> rpnTokens) {
        Stack<String> valueStack = new Stack<>();
        int maxLength = 0;

        // First pass: Determine max length for padding
        for (String token : rpnTokens) {
            if (token.matches("[01]+")) {
                maxLength = Math.max(maxLength, token.length());
            }
        }

        for (String token : rpnTokens) {
            if (token.matches("[01]+")) { // Operand
                valueStack.push(padBinary(token, maxLength));
            } else if (token.equals("!")) { // Unary NOT
                String op = valueStack.pop();
                valueStack.push(applyNot(op));
            } else { // Binary Operators (||, &&)
                String op2 = valueStack.pop();
                String op1 = valueStack.pop();

                if (token.equals("||")) {
                    valueStack.push(applyOr(op1, op2));
                } else if (token.equals("&&")) {
                    valueStack.push(applyAnd(op1, op2));
                }
            }
        }

        // Final result: Convert the remaining binary string to long
        if (valueStack.size() != 1) {
            throw new IllegalArgumentException("Invalid RPN expression.");
        }

        String finalBinary = valueStack.pop();
        // The binary string might be very long; BigInteger would be safer for general cases,
        // but since the output is a single numeric value, a large number type is appropriate.
        // Assuming the result fits within a standard Java long (64-bit).
        return new java.math.BigInteger(finalBinary, 2).longValue();
    }

    // Helper for padding binary strings with leading zeros
    private static String padBinary(String binary, int length) {
        return "0".repeat(length - binary.length()) + binary;
    }

    // Helper for Bitwise NOT operation
    private static String applyNot(String binary) {
        StringBuilder result = new StringBuilder();
        for (char bit : binary.toCharArray()) {
            result.append(bit == '0' ? '1' : '0');
        }
        return result.toString();
    }

    // Helper for Bitwise OR operation
    private static String applyOr(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < bin1.length(); i++) {
            if (bin1.charAt(i) == '1' || bin2.charAt(i) == '1') {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        return result.toString();
    }

    // Helper for Bitwise AND operation
    private static String applyAnd(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < bin1.length(); i++) {
            if (bin1.charAt(i) == '1' && bin2.charAt(i) == '1') {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        return result.toString();
    }
}
