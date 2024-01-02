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
* Nov 22, 2023
* The program calculates the absolute value of a given integer.
* */
package hw.e26;

import java.util.Scanner;

public class AbsValue {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        // no clarification was provided, so
        // integer values are assumed.
        int n;

        // ask user for value
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        // calculate and return result to user,
        // utilizing the Math.abs() method to
        // calculate the absolute value.
        System.out.printf("The absolute value of %d is %d.", n, Math.abs(n));
    }
}
