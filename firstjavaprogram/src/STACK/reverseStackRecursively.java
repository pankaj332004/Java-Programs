package STACK;

import java.util.Stack;

public class reverseStackRecursively {
    public static void displayReverse(Stack<Integer> stack){
        if(stack.isEmpty()) return;
        int top = stack.pop();
        System.out.println(top+" "); // to reverse in opposite order
        displayReverse(stack);
        System.out.println(top+" "); // to print in the same order
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stOriginal = new Stack<>();
        stOriginal.push(10);
        stOriginal.push(20);
        stOriginal.push(30);
        stOriginal.push(40);
        stOriginal.push(50);
        displayReverse(stOriginal);
    }
}
