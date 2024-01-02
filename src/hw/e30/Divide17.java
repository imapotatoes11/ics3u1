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
 * Dec 01, 2023
 * The program builds a new number by joining two numbers entered by the user
 * and outputting the result of the new number divided by 17 (to two decimal places)
 * */
package hw.e30;

import java.util.Scanner;

public class Divide17 {
    /**
     * Custom implementation of rounding, but with decimal places. <br>
     * (java.lang.Math.round() does not support rounding)
     * @param i number to round
     * @param decimals amount of decimal places to round
     * @return rounded number
     */
    public static double round(double i, int decimals) {
        // - move the decimal point to the specified precision
        // - round the number to the nearest integer
        // - divide the number by the specified precision
        return Math.round(i * Math.pow(10, decimals)) / Math.pow(10, decimals);
    }
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        String s1, s2;

        // ask user for numbers
        System.out.print("Number 1: ");
        s1 = sc.nextLine();
        System.out.print("Number 2: ");
        s2 = sc.nextLine();

        // join and return result divided by 17
        // rounded to 2 decimal places
        System.out.println(Divide17.round(
            (double) Integer.parseInt(s1 + s2) / 17f,
            2
        ));
    }
}
