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
 * Sept 27, 2023
 * The following program uses printf to print float values and their squares
 */
package hw.e07;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of change in cents: ");
        int change = sc.nextInt();

        int toonies = 0;
        int loonies = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        while (change > 5){
            if (change >= 200){
                toonies++;
                change -= 200;
            } else if (change >= 100){
                loonies++;
                change -= 100;
            } else if (change >= 25){
                quarters++;
                change -= 25;
            } else if (change >= 10){
                dimes++;
                change -= 10;
            } else if (change >= 5){
                nickels++;
                change -= 5;
            }
        }
        System.out.printf("The minimum number of coins is:%n");
        System.out.printf("    Toonies: %d%n", toonies);
        System.out.printf("    Loonies: %d%n", loonies);
        System.out.printf("    Quarters: %d%n", quarters);
        System.out.printf("    Dimes: %d%n", dimes);
        System.out.printf("    Nickels: %d%n", nickels);
        System.out.printf("    Leftover cents: %d%n", change);
    }
}
