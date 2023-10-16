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
 * Oct 13, 2023
 * The following program calculates the price of a package based on weight and
 * dimensions.
 * */
package hw.e12;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        // establish objects and variables
        Scanner sc = new Scanner(System.in);
        final int limit = 100000;
        int weight, l, w, h, volume;

        // ask user for weight and dimensions
        System.out.printf("Enter the weight of the package: ");
        weight = sc.nextInt();
        System.out.printf("Enter the length of the package: ");
        l = sc.nextInt();
        System.out.printf("Enter the width of the package: ");
        w = sc.nextInt();
        System.out.printf("Enter the height of the package: ");
        h = sc.nextInt();

        // check if package is over 27kg
        if (weight > 27) {
            System.out.println("Package is too heavy.");
        } else {
            // calculate volume
            volume = l * w * h;

            // check if package is over 100000cm^3
            if (volume > limit) {
                System.out.println("Package is too large.");
            } else {
                // calculate price based on the following measurements:
                // Up to 5 kg -> $3.00 per kg
                // Over 5 to 12 kg -> $3.50 per kg
                // Over 12 to 20 kg -> $4.00 per kg
                // Over 20 to 27 kg -> $4.50 per kg
                if (weight <= 5) {
                    System.out.printf("The price is $%.2f", weight * 3.00);
                } else if (weight <= 12) {
                    System.out.printf("The price is $%.2f", weight * 3.50);
                } else if (weight <= 20) {
                    System.out.printf("The price is $%.2f", weight * 4.00);
                } else {
                    System.out.printf("The price is $%.2f", weight * 4.50);
                }
            }
        }
    }
}
