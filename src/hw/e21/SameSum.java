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
* The following program creates two arrays of size 10, filling one
* with user input, and then putting values into the 2nd list so that
* the sum of corresponding cells in both lists is 25.
* */
package hw.e21;

import java.util.Scanner;

public class SameSum {
    public static void main(String[] args) {
        // initialize objects
        final int ARR_SIZE = 10;
        int[] list1 = new int[ARR_SIZE];
        int[] list2 = new int[ARR_SIZE];
        Scanner sc = new Scanner(System.in);

        // ask user for values of list1
        for (int i = 0; i < ARR_SIZE; i++) {
            System.out.printf("Enter value %d: ", i + 1);
            list1[i] = sc.nextInt();
        }

        // a + b = 25, b = 25 - a
        // calculate and store values for list2
        for (int i = 0; i < ARR_SIZE; i++) {
            list2[i] = 25 - list1[i];
        }

        // return arrays to user
        System.out.print("list1: [");
        for (int i = 0; i < ARR_SIZE - 1; i++) {
            System.out.printf("%d, ", list1[i]);
        }
        System.out.printf("%d]", list1[ARR_SIZE - 1]);

        // print a new line to separate arrays
        System.out.println();

        System.out.print("list2: [");
        for (int i = 0; i < ARR_SIZE - 1; i++) {
            System.out.printf("%d, ", list2[i]);
        }
        System.out.printf("%d]", list2[ARR_SIZE - 1]);
    }
}
