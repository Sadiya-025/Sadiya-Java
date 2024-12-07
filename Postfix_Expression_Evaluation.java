import java.util.Stack;
import java.util.Scanner;

class postfixExpressionException extends Exception {
    public postfixExpressionException(String message) {
        super(message);
    }
}

public class Postfix_Expression_Evaluation {
    public static int evaluatePostfixExpression(String postfixExpression) throws postfixExpressionException {
        Stack<Integer> stack = new Stack<>();
        for (char ch : postfixExpression.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));
            } else {
                if (stack.size() < 2) {
                    throw new postfixExpressionException("The Postfix Expression is Invalid");
                }
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result;
                switch (ch) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        if (operand2 != 0) {
                            result = operand1 / operand2;
                        } else {
                            throw new postfixExpressionException("The Postfix Expression is Invalid");
                        }
                        break;
                    default:
                        throw new postfixExpressionException("The Operator in the Postfix Expression is Invalid");
                }
                stack.push(result);
            }
        }
        if (stack.size() != 1) {
            throw new postfixExpressionException("The Postfix Expression is Invalid");
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Postfix Expression: ");
            String postfixExpression = sc.nextLine();
            int result = evaluatePostfixExpression(postfixExpression);
            System.out.println("The Result of the Evaluation is: " + result);
        } catch (postfixExpressionException e) {
            System.out.println("Invalid: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
