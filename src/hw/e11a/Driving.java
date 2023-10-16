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
 * The following program checks if the user is within the age of driving
 * */
package hw.e11a;

import java.util.Scanner;

public class Driving {
    public static void main(String[] args) {
        // instantiate a scanner object and variables
        Scanner sc = new Scanner(System.in);
        int age;

        // ask user for age
        System.out.printf("How old? ");
        age = sc.nextInt();

        // verify user's age
        if (age < 18) {
            System.out.println("Too young to drive");
        } else if (age > 75) {
            System.out.println("Sorry you are over the legal age limit for driving");
        } else {
            System.out.println("Age OK. Have you got a driver's licence?");
        }
    }
}
