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
* The following program creates a 2 dimensional matrix with user-specified
* dimensions.
* */
package hw.e23;

import java.util.Scanner;

public class StarTable {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int x, y;
        String[] dimensions;
        char[][] table;

        // Read input
        System.out.print("Enter the dimensions of the table (eg. 5 x 8): ");
        dimensions = sc.nextLine().split(" x ");
        x = Integer.parseInt(dimensions[0]);
        y = Integer.parseInt(dimensions[1]);

        // Create 2D array
        table = new char[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++)
                table[i][j] = '*';
        }

        // Output table
        for (char[] row : table) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
