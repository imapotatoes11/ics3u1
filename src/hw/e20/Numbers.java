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
* Nov 02, 2023
* The following program does the following (in corresponding order):
* - Declare an array of 6 doubles
* - read in a list a values from the user
* - print the values in reverse order
* - add 10% to each value in the array
* - print all the values that are over 50
* */
package hw.e20;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        // initialize objects
        final int LENGTH = 6;
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[LENGTH];

        // read the list of values from the user
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter value for element %d", i + 1);
            arr[i] = sc.nextDouble();
        }

        // print values in reverse order
        for (int i = arr.length; i > 0; i--) {
            System.out.println(arr[i]);
        }

        // add 10% to each value of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 1.1;
        }

        // print all values over 50
        for (double value: arr) {
            if (value > 50) {
                System.out.println(value);
            }
        }
    }
}
