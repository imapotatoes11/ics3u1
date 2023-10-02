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
* The following program calculates the percentages spent on food,
* clothing, entertainment, and rent
* */
package hw.e07;
import java.util.Scanner;

public class Spending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodSpending, clothingSpending, entertainmentSpending, rentSpending;

        System.out.println("Enter the amount spent last month on the following item:");
        System.out.print("Food: $");
        foodSpending = scanner.nextDouble();
        System.out.print("Clothing: $");
        clothingSpending = scanner.nextDouble();
        System.out.print("Entertainment: $");
        entertainmentSpending = scanner.nextDouble();
        System.out.print("Rent: $");
        rentSpending = scanner.nextDouble();

        double totalSpending = foodSpending + clothingSpending + entertainmentSpending + rentSpending;

        double foodSpendingPercentage = foodSpending / totalSpending * 100;
        double clothingSpendingPercentage = clothingSpending / totalSpending * 100;
        double entertainmentSpendingPercentage = entertainmentSpending / totalSpending * 100;
        double rentSpendingPercentage = rentSpending / totalSpending * 100;

        System.out.printf("Category        Budget\n");
        System.out.printf("Food            %.2f%%\n", foodSpendingPercentage);
        System.out.printf("Clothing        %.2f%%\n", clothingSpendingPercentage);
        System.out.printf("Entertainment   %.2f%%\n", entertainmentSpendingPercentage);
        System.out.printf("Rent            %.2f%%\n", rentSpendingPercentage);
    }
}