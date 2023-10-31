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
 * Oct 25, 2023
 * The following program adds up the squares and adds up the cubes of integers from
 * 1 to N, where N is a positive integer entered by the user.
 * */
package hw.e18;

import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        // initialize variables
        int limit = 0;
        int i = 1;
        int squareSum = 0;
        int cubeSum = 0;
        Scanner sc = new Scanner(System.in);

        // ask user for input
        System.out.print("Enter a positive integer N: ");
        limit = sc.nextInt();

        // compute the sum
        while (i <= limit) {
            squareSum += i * i;
            cubeSum += i * i * i;
            i++;
        }

        // print out the results
        System.out.println("Sum of squares: " + squareSum);
        System.out.println("Sum of cubes: " + cubeSum);
    }
}
