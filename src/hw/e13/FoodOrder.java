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
 * The following program asks the user for a food order and outputs the cost.
 * */
package hw.e13;

import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        int selection;

        // output menu
        System.out.println("1) juice, muffin & coffee");
        System.out.println("2) cereal, toast & milk");
        System.out.println("3) egg, toast & coffee");
        System.out.println("4) banana, granola & milk");
        System.out.println("5) grapefruit, bacon, eggs & coffee");

        // ask user to pick a selection
        System.out.printf("Enter your selection: ");
        selection = sc.nextInt();

        // output selection
        switch (selection) {
            case 1 -> System.out.println("The cost is $2.50");
            case 2 -> System.out.println("The cost is $2.50");
            case 3 -> System.out.println("The cost is $3.00");
            case 4 -> System.out.println("The cost is $3.50");
            case 5 -> System.out.println("The cost is $5.00");
            default -> System.out.println("Invalid selection.");
        }
    }
}
