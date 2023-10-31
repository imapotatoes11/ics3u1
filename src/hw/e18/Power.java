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
 * Oct 25, 2023
 * The following program computes X^N where X is a floating point number and N
 * is a positive integer. The program informs the user that N must be positive
 * if the user enters a negative value for N.
 * */
package hw.e18;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        // initialize variables
        double base = 0;
        int exponent = 0;
        int i = 1;
        double product = 1;
        Scanner sc = new Scanner(System.in);

        // ask user for input
        System.out.print("Enter a floating point number X: ");
        base = sc.nextDouble();
        System.out.print("Enter a positive integer N: ");
        exponent = sc.nextInt();

        // compute the product
        if (exponent > 0) {
            while (i <= exponent) {
                product *= base;
                i++;
            }
        } else {
            System.out.println("N must be positive.");
            System.exit(-1);
        }

        // print out the results
        System.out.printf("%.2f^%d: " + product, base, exponent);
    }
}
