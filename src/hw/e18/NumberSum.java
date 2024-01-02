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
 * The following program adds up integers that the user enters.
 * The program will first ask how many numbers will be added up,
 * then will prompt the user for each number, before finally
 * printing the sum.
 * */
package hw.e18;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        // initialize variables
        int num = 0;
        int sum = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        // ask user for input
        System.out.print("How many numbers will be added up? ");
        num = sc.nextInt();

        // loop until the number of integers to be added is reached
        while (i < num) {
            // ask user for input
            System.out.print("Enter an integer: ");
            sum += sc.nextInt();
            i++;
        }

        // print out the results
        System.out.println("Sum: " + sum);
    }
}
