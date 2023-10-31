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
 * The following program continually asks the user for an integer (stopping when
 * a non-positive integer is entered), and outputs the number of even integers
 * entered.
 * */
package hw.e18;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        // initialize variables
        int num = 1;
        int even = 0;
        Scanner sc = new Scanner(System.in);

        // loop until a non-positive integer is entered
        while (num > 0) {
            // ask user for input
            System.out.print("Enter an integer: ");
            num = sc.nextInt();

            // check if the integer is even
            if (num % 2 == 0 && num > 0) {
                even++;
            }
        }

        // print out the results
        System.out.println("Number of even integers: " + even);
    }
}
