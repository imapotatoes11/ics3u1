/*
 * Copyright 2023 Kevin Wang
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the license at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the license is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * license for the specific language governing permissions and limitations under
 * the license.
 * */
/*
* Oct 13, 2023
* The following program asks the user to solve a random arithmetic expression
* */
package hw.e12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pass {
    public static Object randChoice(Object[] a) {
        /*
        * Returns a random element from the given array
         */
        Random random = new Random();
        return a[random.nextInt(a.length)];
    } public static int randInt(int origin, int bound) {
        /*
        * Returns a random integer between the given bounds
         */
		Random random = new Random();
		return random.nextInt(origin, bound);
	}
    public static void main(String[] args) {
        // initialize scanner class
        Scanner sc = new Scanner(System.in);
        // generate random expression
        HoldList list = HoldList.randomExpression();
        // evaluate expression and round to nearest int
        int result = (int) Math.round(list.evaluate());

        // ask user to solve expression
        System.out.printf("What is %s (rounded to the nearest whole number, trig functions in degrees)? ", list);
        int answer = sc.nextInt();

        // confirm user's answer
        if (answer == result) {
            System.out.println("Correct!");
        } else {
            System.out.printf("Incorrect. The answer is approximately %d.\n(The real answer is %f)", result, list.evaluate());
        }
    }
}


class HoldList {
    /*
    * A class that holds a list of "terms", essentially a class to hold an expression
     */

    // holds the list of terms
    public ArrayList<Hold> holds;

    public HoldList(ArrayList<Hold> holds) {
        // constructor sets the expression into this.holds
        this.holds = holds;
    }
    private static double eval(ArrayList<Hold> holds) {
        // create a StringBuilder to turn the expression into a string for Eval.eval() to evaluate
         StringBuilder out = new StringBuilder();
         for (Hold hold : holds) {
             out.append(hold);
         }

         // evaluate and return result
         return Eval.eval(out.toString());
    }
    public void evaluateInPlace() {
        // evaluate the expression and set it to the first element in this.holds
        // not used but might be useful in the future
        Hold hold = new Hold(HoldList.eval(holds));
        holds = new ArrayList<Hold>();
        holds.add(hold);
    }
    public double evaluate() {
        // evaluates the current expression and returns it as a double
        return HoldList.eval(holds);
    }
    public static double evaluate(HoldList holdList) {
        // evaluates the given expression and returns it as a double
        // not used but might be useful in the future
        return HoldList.eval(holdList.toArrayList());
    }
    public ArrayList<Hold> toArrayList() {
        // returns the expression as an ArrayList
        ArrayList<Hold> out = new ArrayList<>();
        for(Hold i : this.holds) {
            out.add(i);
        } return out;
    }
    public String toString() {
        // returns the expression as a string
        StringBuilder out = new StringBuilder();
        for (Hold hold : holds) {
            out.append(hold);
        } return out.toString();
    }
    public static HoldList randomExpression() {
        // generates a random expression with 3-30 terms

        // create an arraylist holding the terms
        ArrayList<Hold> holds = new ArrayList<>();
        // queue for managing brackets
        ArrayList<String> bracketQueue = new ArrayList<>();

        // Pass.randInt() defines the size/length of the expression
        for (int i = 0; i < Pass.randInt(3, 30); i++) {

            // first number in expression
            holds.add(new Hold(Pass.randInt(1, 500)));

            // random chance to close the bracket (~35% chance per roll)
            if (Pass.randInt(1, 100) >= 65) {
                if (bracketQueue.size() > 0) {
                    holds.add(new Hold(bracketQueue.remove(0)));
                }
            }

            // random operator
            holds.add(new Hold(Pass.randChoice(new Object[]{
                    "+", "-", "*", "/", "^",
                    "+", "-", "*", "/"
                    // \-> DMAS operators doubled to half the chances of there being an exponent
                    //     to minimize too wacky numbers
            })));


            // random chance to add an opening bracket (~40% chance per roll)
            if (Pass.randInt(1,100) >= 60) {
                holds.add(new Hold(Pass.randChoice(new Object[]{
                        "(", "sin(", "cos(", "tan(",
                        "asin(", "acos(", "atan("
                })));
                bracketQueue.add(")");
            }
        }
        // add the last number
        holds.add(new Hold(Pass.randInt(1, 500)));

        // if there are still brackets that need to be closed, close them now
        while (!bracketQueue.isEmpty()) {
            holds.add(new Hold(bracketQueue.remove(0)));
        }

        // check if the number is too janky. if it is, rerun the method.
        double result = new HoldList(holds).evaluate();
        if (result > Math.pow(2, 31) || result < -Math.pow(2, 31) ||
                (result + "").equals("NaN") || (int) result == 0)
            return HoldList.randomExpression();

        // return the final expression
        return new HoldList(holds);
    }
}


class Hold {
    // the entire purpose of this object is to have both ints and strings (numbers and operators)
    // in a single arraylist.

    // object for holding a value (number or operator)
    public Object value;
    public Hold(Object value) {
        this.value = value;
    }
    public String toString() {
        // wow i sure wonder what this method does
        return value.toString();
    }
}

class Eval{
    // eval() method borrowed from Boann
    // https://stackoverflow.com/a/26227947
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)` | number
            //        | functionName `(` expression `)` | functionName factor
            //        | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return +parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    if (!eat(')')) throw new RuntimeException("Missing ')'");
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    if (eat('(')) {
                        x = parseExpression();
                        if (!eat(')')) throw new RuntimeException("Missing ')' after argument to " + func);
                    } else {
                        x = parseFactor();
                    }
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("asin")) x = Math.asin(Math.toRadians(x));
                    else if (func.equals("acos")) x = Math.acos(Math.toRadians(x));
                    else if (func.equals("atan")) x = Math.atan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}
