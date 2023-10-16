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
 * Oct 10, 2023
 * The following program determines the roots of a discriminant given values of a, b, and c
 * */
package hw.e11;

import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        // instantiate a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // ask user for the values
        System.out.printf("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.printf("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.printf("Enter the value of c: ");
        int c = sc.nextInt();

        // calculate result
        double result = Math.pow(b, 2) - (4 * a * c);

        // determine if result is negative, 0, or positive and return result to user
        if (result < 0) {
            System.out.println("No roots.");
        } else if (result == 0) {
            System.out.println("One root");
        } else {
            System.out.println("Two roots");
        }
    }
}
