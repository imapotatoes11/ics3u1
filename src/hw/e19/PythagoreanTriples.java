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
 * Oct 27, 2023
 * The following program prompts the user for a positive integer and then finds
 * and prints all pythagorean triplets whose largest member is less than or equal
 * to that integer using a nested for loop.
 * */
package hw.e19;

import java.util.Scanner;

public class PythagoreanTriples {
    public static void main(String[] args) {
        // initialize variables
        Scanner sc = new Scanner(System.in);
        int num;
        int a, b, c;

        // ask user for input
        System.out.print("Enter a positive integer: ");
        num = sc.nextInt();

        // loop through all possible combinations of a, b, and c
        // time complexity: O(n^3) (very slow but it works)
        for (a = 1; a <= num; a++) {
            for (b = a; b <= num; b++) {
                for (c = b; c <= num; c++) {
                    // print out the numbers if they
                    // are a pythagorean triple
                    if (a * a + b * b == c * c) {
                        System.out.printf("%d %d %d\n", a, b, c);
                    }
                }
            }
        }
    }
}
