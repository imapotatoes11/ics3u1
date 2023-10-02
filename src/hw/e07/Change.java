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
* This program calculates the minimum change
* required given an amount of money in cents.
* */
package hw.e07;
import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount (in cents): ");
        int amount = scanner.nextInt();

        // Initialize the number of coins for each denomination to 0.
        int toonies = 0;
        int loonies = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        // Calculate the minimum number of coins for each denomination.
        while (amount >= 200) {
            toonies++;
            amount -= 200;
        }

        while (amount >= 100) {
            loonies++;
            amount -= 100;
        }

        while (amount >= 25) {
            quarters++;
            amount -= 25;
        }

        while (amount >= 10) {
            dimes++;
            amount -= 10;
        }

        while (amount >= 5) {
            nickels++;
            amount -= 5;
        }

        // Display the minimum number of coins for each denomination and the number of cents that could not be made into change.
        System.out.println("The minimum number of coins is:");
        System.out.println("    Toonies: " + toonies);
        System.out.println("    Loonies: " + loonies);
        System.out.println("    Quarters: " + quarters);
        System.out.println("    Dimes: " + dimes);
        System.out.println("    Nickels: " + nickels);
        System.out.println("    Leftover cents: " + amount);
    }
}