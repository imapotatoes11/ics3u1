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
* The following program asks the user to input 16 integers in an array with dimensions
* 4,4
* */
package hw.e25a;

import java.util.Scanner;

public class DiagonalSmallest {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SIZE = 4;
        int[][] numbers = new int[SIZE][SIZE];
        int sum = 0;

        // Populate array
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d:  ", i + 1);
            String[] values = sc.nextLine().split(" ");
            for (int j = 0; j < SIZE; j++) {
                numbers[i][j] = Integer.parseInt(values[j]);
            }
        }

        // Find smallest diagonal
        for (int i = 0; i < SIZE; i++) {
            sum += numbers[i][i]; // Top-left to bottom-right
            sum -= numbers[i][SIZE - i - 1]; // Top-right to bottom-left
        }

        // Output results
        if (sum < 0) {
            System.out.println("(1, 1) to (4, 4) diagonal is smaller.");
        } else if (sum > 0) {
            System.out.println("(1, 4) to (4, 1) diagonal is smaller.");
        } else {
            System.out.println("Both diagonals are equal.");
        }
    }
}
