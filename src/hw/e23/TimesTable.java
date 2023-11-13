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
* Nov 13, 2023
* The following program creates and prints the 12 x 12 times table.
* */
package hw.e23;

public class TimesTable {
    public static void main(String[] args) {
        // Initialize variables
        final int SIZE = 12;
        int[][] table = new int[SIZE][SIZE];

        // Create 2D array
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= SIZE; j++)
                table[i-1][j-1] = i * j;
        }

        // Output table
        System.out.print("    ");
        for (int i = 1; i <= SIZE; i++) { // Header row
            System.out.printf("%-4d", i);
        }
        for (int i = 0; i < SIZE; i++) { // Body
            System.out.printf("%n%-4d", i + 1); // Header column
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%-4d", table[i][j]);
            }
        }
    }
}
