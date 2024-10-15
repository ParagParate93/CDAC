import java.util.Stack;
import java.util.Scanner;

class InfixToPostfix {

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1; // Non-operator
        }
    }

    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    static void getPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is an operand (assuming single-letter variables)
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch).append(" ");
            } 
            // If the character is '(', push it to the stack
            else if (ch == '(') {
                st.push(ch);
            } 
            // If the character is ')', pop from stack until '(' is encountered
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop()).append(" ");
                }
                st.pop(); // Remove '(' from the stack
            } 
            // If the character is an operator
            else if (isOperator(ch)) {
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(ch)) {
                    result.append(st.pop()).append(" ");
                }
                st.push(ch); // Push current operator to stack
            }
        }

        // Pop all the operators from the stack
        while (!st.isEmpty()) {
            result.append(st.pop()).append(" ");
        }

        System.out.println("Postfix Expression: " + result.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression:");
        String s = sc.nextLine();
        getPostfix(s);
        sc.close();
    }
}
