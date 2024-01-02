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
* The following program creates an array with dimensions 3,3, and identifies
* all integers that are odd or even
* */
package hw.e25a;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DOddEven {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SIZE = 3;
        int[][] numbers = new int[SIZE][SIZE];
        String[] values;

        // Populate array
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d:  ", i);
            values = sc.nextLine().split(" ");
            numbers[i][0] = Integer.parseInt(values[0]);
            numbers[i][1] = Integer.parseInt(values[1]);
            numbers[i][2] = Integer.parseInt(values[2]);
        }

        // Check all odd/even
        for (int i = 0; i < SIZE; i++) {
            // Check rows
            if (Arrays.stream(numbers[i]).allMatch(n -> n % 2 == 0)) {
                System.out.printf("R%d: All numbers are even.%n", i);
            } else if (Arrays.stream(numbers[i]).allMatch(n -> n % 2 == 1)) {
                System.out.printf("R%d: All numbers are odd.%n", i);
            }

            // Check columns
            if (numbers[0][i] % 2 == 0 && numbers[1][i] % 2 == 0 && numbers[2][i] % 2 == 0) {
                System.out.printf("C%d: All numbers are even.%n", i);
            } else if (numbers[0][i] % 2 == 1 && numbers[1][i] % 2 == 1 && numbers[2][i] % 2 == 1) {
                System.out.printf("C%d: All numbers are odd.%n", i);
            }
        }
    }
}
