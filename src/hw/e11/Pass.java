package hw.e11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Pass {
    public static Object randChoice(Object[] a) {
        Random random = new Random();
        return a[random.nextInt(a.length)];
    }
    public static void main(String[] args) {
        Expression exp = Expression.randomExpression();
        for (Value term : exp.terms) {
            System.out.print(term.value + " ");
        }
        System.out.println();
        System.out.println(exp.evaluate());
    }
}
class Expression {
    public ArrayList<Value> terms;
    public Expression(ArrayList<Value> terms) {
        this.terms = terms;
    }
    public static Expression randomExpression() {
        ArrayList<Value> terms = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            terms.add(new Value(Pass.randChoice(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
            terms.add(new Value(Pass.randChoice(new Object[]{"+", "-", "*", "/"})));
        }
        terms.add(new Value(Pass.randChoice(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        return new Expression(terms);
    }
    public double evaluate() {
        ArrayList<Value> postfixExpression = convertToPostfix();

        // Evaluate the postfix expression using a stack
        Stack<Double> stack = new Stack<>();
        for (Value term : postfixExpression) {
            if (term.isOperator()) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation((char) term.value, operand1, operand2);
                stack.push(result);
            } else {
//                try {
                    stack.push((double) ((Integer) term.value).intValue());
//                } catch (ClassCastException e) {
//                    // TODO: gawd damn
//                }
            }
        }

        return stack.pop();
    }
    private int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0; // Assuming other characters are operands
        }
    }

    private ArrayList<Value> convertToPostfix() {
        ArrayList<Value> postfixExpression = new ArrayList<>();
        Stack<Character> operatorStack = new Stack<>();

        for (Value term : terms) {
            if (term.isOperator()) {
                char operator = (char) term.value;

                while (!operatorStack.isEmpty() && getPrecedence(operatorStack.peek()) >= getPrecedence(operator)) {
                    postfixExpression.add(new Value(operatorStack.pop()));
                }

                operatorStack.push(operator);
            } else {
                postfixExpression.add(term);
            }
        }

        while (!operatorStack.isEmpty()) {
            postfixExpression.add(new Value(operatorStack.pop()));
        }

        return postfixExpression;
    }
    private double performOperation(char operator, double operand1, double operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
class Value {
    public Object value;
    public Value(Object value) {
        if (value instanceof String)
            try {
                this.value = (int) Integer.parseInt((String) value);
            } catch (NumberFormatException e) {
                this.value = value;
            }
        else
            this.value = value;
    }

    public boolean isOperator () {
        return value instanceof Character && ("+-*/").indexOf((char) value) != -1;
    }
}