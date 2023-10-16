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
 * Oct 10, 2023
 * The following program checks for the properties of an integer
 * */
package hw.e11;

import java.util.Random;
import java.util.Scanner;

public class CheckInt {
    public static boolean isPositive(int i) {
        return i > 0;
    }
    public static boolean isEven(int i) {
        return i % 2 == 0;
    }

    public static boolean multiple7(int i) {
        return i % 7 == 0;
    }
    public static void main(String[] args) {
        // import scanner class for reading user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // decision structure for determining number properties
        if (CheckInt.isPositive(num)) {
            System.out.println("The number is positive.");
        } else System.out.println("The number is negative.");

        if (CheckInt.isEven(num)) {
            System.out.println("The number is even.");
        } else System.out.println("The number is odd");

        if (CheckInt.multiple7(num)) {
            System.out.println("The number is a multiple of 7.");
        } else System.out.println("The number is not a multiple of 7");
    }
}
