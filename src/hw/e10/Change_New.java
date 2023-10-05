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
 * Oct 02, 2023
 * Read a dollar amount and output the minimum number of coins required to make that amount
 * */
package hw.e10;

import java.util.Scanner;

public class Change_New {
    public static void main (String[] args) {
        // Read input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of dollars: $");
        double dollars = sc.nextDouble();
        int cents = (int) (dollars * 100);

        // Calculate the number of each coin in descending order
        int[] toonies = changePerCoin((int) cents, 200); // toonies
        int[] loonies = changePerCoin(toonies[1], 100); // loonies
        int[] quarters = changePerCoin(loonies[1], 25); // quarters
        int[] dimes = changePerCoin(quarters[1], 10); // dimes
        int[] nickels = changePerCoin(dimes[1], 5); // nickels

        // Output the number of each coin
        System.out.println("The minimum number of coins is:");
        System.out.println(" - Toonies: " + toonies[0]);
        System.out.println(" - Loonies: " + loonies[0]);
        System.out.println(" - Quarters: " + quarters[0]);
        System.out.println(" - Dimes: " + dimes[0]);
        System.out.println(" - Nickels: " + nickels[0]);
        System.out.println(" - Unchanged coins: " + nickels[1]);
    }

    public static int[] changePerCoin (int amount, int denomination) {
        int[] result = new int[2];
        result[0] = amount / denomination; // number of coins that can be converted
        result[1] = amount % denomination; // amount of change left
        return result;
    }
}
