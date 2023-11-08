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
* The following program reverses a given array
* */
package hw.e21;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // initialize objects
        final int ARR_SIZE = 10;
        Scanner sc = new Scanner(System.in);
        int[] list1 = new int[ARR_SIZE];
        int[] list2 = new int[ARR_SIZE];

        // ask user for values of list1
        for (int i = 0; i < ARR_SIZE; i++) {
            System.out.printf("Enter value %d: ", i + 1);
            list1[i] = sc.nextInt();
        }

        // reverse list order and return to user
        // reverse list
        for (int i = 0; i < ARR_SIZE; i++) {
            list2[i] = list1[ARR_SIZE - 1 - i];
        }

        // return list2 to user
        System.out.print("list2: [");
        for (int i = 0; i < ARR_SIZE - 1; i++) {
            System.out.printf("%d, ", list2[i]);
        }
        System.out.printf("%d]", list2[ARR_SIZE - 1]);
    }
}
