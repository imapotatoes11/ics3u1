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
* Nov 02, 2023
* The following program outputs a message indicating whether or not 10 integers
* entered by the user are odd or even
* */
package hw.e25a;

import java.util.Scanner;

public class Array1DOddEven {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SIZE = 10;
        int[] numbers = new int[SIZE];

        // Populate array
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = sc.nextInt();
        }

        // Check all odd/even
        boolean allOdd = true;
        boolean allEven = true;
        for (int i = 0; i < SIZE; i++) {
            if (numbers[i] % 2 == 0) {
                allOdd = false;
            } else {
                allEven = false;
            }

            if (!allOdd && !allEven) {
                break;
            }
        }

        // Output results
        if (allOdd) {
            System.out.println("All numbers are odd.");
        } else if (allEven) {
            System.out.println("All numbers are even.");
        } else {
            System.out.println("Not all numbers are odd or even.");
        }
    }
}
