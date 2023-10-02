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
* This program calculates the amount of principle given interest
* */
package hw.e07;
import java.util.Scanner;

public class SimpleInterestPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the desired amount:");
        double amount = scanner.nextDouble();

        System.out.println("Enter the number of years:");
        int years = scanner.nextInt();

        System.out.println("Enter the interest rate:");
        double interestRate = scanner.nextDouble();

        double principal = amount / (1 + years * interestRate / 100);

        System.out.println("Principal amount: " + principal);
    }
}