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
 * Sept 20, 2023
 * The following program calculates the cost of a fast food order
 * */
package hw.e05;

import java.util.Scanner;

public class Fastfood {
    public static void main(String[] args) {
        double burgerCost = 1.69;
        double friesCost = 1.09;
        double drinkCost = 0.99;
        double taxRate = 0.065;
        Scanner sc = new Scanner(System.in);
        System.out.printf("How many burgers? ");
        int numBurgers = sc.nextInt();
        System.out.printf("How many fries? ");
        int numFries = sc.nextInt();
        System.out.printf("How many drinks? ");
        int numDrinks = sc.nextInt();
        double subtotal = burgerCost * numBurgers + friesCost * numFries + drinkCost * numDrinks;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", total);
    }
}
