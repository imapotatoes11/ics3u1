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
* The following program converts a given price in USD to CAD
* */
package hw.e09;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        // Instantiate the Scanner class to read user input
        Scanner sc = new Scanner(System.in);

        // Define constant(s)
        final double USD_TO_CAD = 1.35;

        // Ask user for USD amount
        System.out.print("Enter price in USD: $");
        double price = sc.nextDouble();

        // Calculate and return output to user
        System.out.printf("The price in CAD is $%,.2f", (price * USD_TO_CAD));
    }
}
