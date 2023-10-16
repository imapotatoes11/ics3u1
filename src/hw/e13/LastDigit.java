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
 * The following program asks the user for a number and outputs the last digit
 * of the number in english.
 * */
package hw.e13;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        String input;
        String digit;

        // ask user for a number
        System.out.printf("Enter a number: ");
        input = sc.nextLine();

        // find the last digit of the number and translate to english
        digit = new String[] {"zero", "one", "two", "three", "four", "five", "six",
                            "seven", "eight", "nine"} [
                                    Integer.parseInt(input.substring(input.length() - 1))
        ];

        // output to user
        System.out.printf("The last digit of %s is %s", input, digit);
    }

    private static void main() {
        // here is the solution using a switch case statement
        // initialize objects
        Scanner sc = new Scanner(System.in);
        String input;
        String digit;

        // ask user for a number
        System.out.printf("Enter a number: ");
        input = sc.nextLine();

        // find the last digit of the number and translate to english
        switch (Integer.parseInt(input.substring(input.length() - 1))) {
            case 0: digit = "zero";
            case 1: digit = "one";
            case 2: digit = "two";
            case 3: digit = "three";
            case 4: digit = "four";
            case 5: digit = "five";
            case 6: digit = "six";
            case 7: digit = "seven";
            case 8: digit = "eight";
            case 9: digit = "nine";
            default: digit = null;
        }

        // output to user
        System.out.printf("The last digit of %s is %s", input, digit);
    }
}
