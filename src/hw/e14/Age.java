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
 * Oct 24, 2023
 * The following program is an age guessing program
 * */
package hw.e14;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        // instantiate objects
        Scanner sc = new Scanner(System.in);
        final int age = 15;
        int guess = 0;

        // the loop
        while (guess != age) {
            // ask user for age
            System.out.printf("Guess my age: ");
            guess = sc.nextInt();

            // if guess is correct, tell the user
            // if guess is incorrect, tell the user
            if (guess == age) {
                System.out.println("Correct!");
            } else {
                System.out.println("That is not my age, guess again.");
            }
        }
    }
}
