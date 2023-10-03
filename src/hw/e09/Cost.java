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
* The following program calculates the after-tax final price of a given subtotal and amount of bags
* */
package hw.e09;

import java.util.Scanner;

public class Cost {
    public static void main(String[] args) {
        // Instantiate the Scanner class for reading user input
        Scanner sc = new Scanner(System.in);

        // Ask user for subtotal price
        System.out.print("Enter price: $");
        final double PRICE = sc.nextDouble();

        // Ask user for number of bags used
        System.out.print("How many bags? ");
        final int BAGS = sc.nextInt();


        // Calculate the subtotal and total (hst 13%)
        double subtotal = PRICE + (BAGS * 0.05);
        double total = subtotal * 1.13;

        // Output the total price to the user
        System.out.printf("Your total is $%,.2f", total);
    }
}
