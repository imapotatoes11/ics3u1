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
* Oct 06, 2023
* The following program checks if the user can vote or not.
* */
package hw.e11;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        // Initialize scanner class
        Scanner sc = new Scanner(System.in);

        // Ask user for age and store it in `age`
        System.out.print("What is your age?: ");
        int age = sc.nextInt();

        // Check if age is greater than or equal to 18
        if (age >= 18) {
            System.out.println("You are old enough to vote!");
        } else {
            System.out.println("You are not old enough to vote.");
        }
    }
}
