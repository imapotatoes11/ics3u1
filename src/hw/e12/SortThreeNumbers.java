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
 * Oct 13, 2023
 * The following program sorts 3 positive numbers in ascending order
 * */
package hw.e12;

import java.util.Scanner;

public class SortThreeNumbers {
    public static int[] sort(int[] arr) {
        // simple bubblesort algorithm
        for (int i = 0; i < Math.floorDiv(arr.length, 2); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) continue;
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // initialize objects and variables
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        // ask user for numbers
        System.out.printf("Input first number: ");
        a = sc.nextInt();
        System.out.printf("Input second number: ");
        b = sc.nextInt();
        System.out.printf("Input third number: ");
        c = sc.nextInt();

        // check if numbers are all positive
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Please input positive numbers only.");
            System.exit(1);
        } else {
            // sort the numbers
            int[] arr = {a, b, c};
            arr = sort(arr);
            System.out.printf("The numbers in ascending order are: %d, %d, %d\n", arr[0], arr[1], arr[2]);
        }
    }
}
