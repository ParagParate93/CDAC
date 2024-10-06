// 4. Evaluate a postfix expression using a stack.

import java.util.Stack;
import java.util.Scanner;

class EvaluatePostFix {
    static int solveExpression(String s) {
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '*' || ch == '+' || ch == '-' || ch == '/') {
                int a = st.pop();
                int b = st.pop();
                
                int ans = 0;
                switch (ch) {
                    case '*':
                        ans = a * b;
                        break;
                    case '+':
                        ans = a + b;
                        break;
                    case '-':
                        ans = b - a;
                        break;
                    case '/':
                        ans = b / a;
                        break;
                }
                st.push(ans);
            } else if (Character.isDigit(ch)) { // Check if the character is a digit
                st.push(Character.getNumericValue(ch)); // Convert char to int and push
            } else {
                System.out.println("Invalid character: " + ch);
                return Integer.MIN_VALUE; // Return an error code
            }
        }
        
        return st.isEmpty() ? Integer.MIN_VALUE : st.pop(); // Return result or error
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = solveExpression(s);
        
        if (ans != Integer.MIN_VALUE) {
            System.out.println("Result: " + ans);
        } else {
            System.out.println("Error evaluating expression.");
        }
        sc.close();
    }
}
