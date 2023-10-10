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
 * Oct 05, 2023
 * The following program calculates the user's salary given
 * the user's sales this month.
 * */
package hw.e11;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        // instantiate a scanner object
        Scanner sc = new Scanner(System.in);

        // set base salary value
        double salary = 1000;

        // ask user for sales this month
        System.out.print("How many sales this month?: ");
        int sales = sc.nextInt();

        if (sales > 10) {
            // sales > 10, multiply corresponding multiplier
            salary *= (1 + (double) sales / 100);
        }

        // return final salary result to user
        System.out.printf("Your salary this month is $%,.2f", salary);
    }
}
