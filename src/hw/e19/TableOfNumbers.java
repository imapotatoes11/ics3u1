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
 * The following program prompts the user for two numbers x & y. It will then
 * output a table of numbers with x rows, each row listing the number from 1 to
 * y, separated by a space.
 * */
package hw.e19;

import java.util.Scanner;

public class TableOfNumbers {
    public static void main(String[] args) {
        // initialize variables
        Scanner sc = new Scanner(System.in);
        int x, y;
        int i = 0;
        int j = 0;

        // ask user for input
        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();

        // print out the table
        while (i < x) {
            while (j < y) {
                System.out.print(j + 1 + " ");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
    }
}
