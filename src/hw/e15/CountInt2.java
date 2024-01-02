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
 * The following program will count the number of integers the user
 * entered, with the user entering a negative number to exit.
 * */
package hw.e15;

import java.util.Scanner;

public class CountInt2 {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        int count = 0; int ans = 0;

        // ask user for number and add 1 to count,
        // unless the number is negative
        do {
            System.out.printf("Enter a number (negative to exit): ");
            ans = sc.nextInt();

            if (ans >= 0) {
                count++;
            }
        } while (ans >= 0);

        // return result to user
        System.out.println(count);
    }
}
