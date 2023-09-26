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
 * The following program demonstrates the use of the Scanner class for double input,
 * as well as calculating the cost of making a pizza.
 * */
package hw.e05;

public class PizzaCost {
    public static void main(String[] args) {
        System.out.printf("Enter the diameter of the pizza in inches:");
        double diameter = new java.util.Scanner(System.in).nextDouble();
        double labourCost = 0.75;
        double rentCost = 1.00;
        double materialsCost = 0.05 * diameter * diameter;
        double totalCost = labourCost + rentCost + materialsCost;
        System.out.printf("The total cost of making the pizza is $%.2f.%n", totalCost);
    }
}
