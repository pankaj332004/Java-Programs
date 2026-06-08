package practical2;

public class Q5 {
        // Method with one parameter
        void show(int num) {
            System.out.println("Integer: " + num);
        }
        // Method with two parameters
        void show(int num1, int num2) {
            System.out.println("Sum: " + (num1 + num2));
        }
        // Method with a different parameter type
        void show(String text) {
            System.out.println("String: " + text);
        }
        public static void main(String[] args) {
            Q5 obj = new Q5();
            obj.show(10);          // Calls the method with an int parameter
            obj.show(5, 15);       // Calls the method with two int parameters
            obj.show("Hello");     // Calls the method with a String parameter
        }
}
