/*
 * Copyright 2024 Kevin Wang
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
 * Jan 02, 2024
 * The program repeatedly asks for the numerator and divisor. For each set of data,
 * the program prints out the result (quotient) or an informative error message if
 * there is a problem (e.g. divide by zero). if data entered for the numerator begins
 * with the characters 'q' or 'Q', the program quits.
 * */
package hw.e37;

import java.io.*;
import java.util.*;

public class DivideLoop {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);

        // loop and ask for numerator and divisor
        for (;;) {
            System.out.print("Enter the numerator: ");
            String numerator = sc.nextLine();

            if (numerator.charAt(0) == 'q' || numerator.charAt(0) == 'Q') {
                return;
            }

            System.out.print("Enter the divisor: ");
            String divisor = sc.nextLine();

            // try to divide the numerator by the divisor
            try {
                System.out.printf("%s / %s = %.2f\n", numerator, divisor, Math.round(Integer.parseInt(numerator) / Double.parseDouble(divisor) * 100.0) / 100.0);
            } catch (NumberFormatException e) {
                System.out.printf("%s or %s is not a number\n", numerator, divisor);
            } catch (ArithmeticException e) {
                System.out.printf("Cannot divide %s by %s\n", numerator, divisor);
            }
        }
    }
}
