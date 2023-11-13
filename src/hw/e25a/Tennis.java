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
* The program does the following:
* - declare and create a 2D array to represent a given table
* - prompt user for score of each set and fill in the array accodingly
* - find and output the total number of games won by player 2
* - calculate and output how many sets that were won by player 1
* */
package hw.e25a;

import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        final int SIZE = 5;
        final int PLAYERS = 2;
        int[][] scores = new int[PLAYERS][SIZE];
        int p2Rounds = 0;
        int p1Sets = 0;
        String[] values;

        // Populate array
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Set %d:  ", i + 1);
            values = sc.nextLine().split("-");
            scores[0][i] = Integer.parseInt(values[0]); // Player 1
            scores[1][i] = Integer.parseInt(values[1]); // Player 2
        }

        // Aggregate scores
        for (int i = 0; i < SIZE; i++) {
            p2Rounds += scores[1][i];
            if (scores[0][i] > scores[1][i]) {
                p1Sets++;
            }
        }

        // Output results
        System.out.printf("Player 2 won %d rounds.%n", p2Rounds);
        System.out.printf("Player 1 won %d sets.", p1Sets);
    }
}
