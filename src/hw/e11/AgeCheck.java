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
 * The following program checks if the user is old enough to vote
 * */
package hw.e11;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        // instantiate a new scanner object
        Scanner sc = new Scanner(System.in);

        // ask user for age
        System.out.print("What is your age?: ");
        int age = sc.nextInt();

        // calculate and return result to user
        if (age >= 18) {
            System.out.println("OLD ENOUGH TO VOTE");
        } else {
            System.out.printf("You need to wait %d years before you can vote!", 18 - age);
        }
    }
}
