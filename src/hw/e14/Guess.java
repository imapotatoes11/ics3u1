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
 * The following program is a random number guesser
 * */
package hw.e14;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        // instantiate objects
        Scanner sc = new Scanner(System.in);
        // we can just create an anonymous random object since
        // java has garbage collection and we weren't taught memory safety
        final int num = new Random().nextInt(1, 21);
        int guess = num == 1 ? 2 : 1;
        long guesses = 0;

        // the loop
        while (guess <= 20 && guess >= 1 && guess != num) {
            // ask user for number
            System.out.printf("Guess a number 1-20: ");
            guess = sc.nextInt();

            // if number is correct, print correct
            // if the number is wrong, tell user
            // if number is invalid, tell user
            if (guess == num) {
                System.out.println("Correct!");
                guesses++;
            } else {
                if (guess <= 20 && guess >= 1) {
                    System.out.println("wrong :( try again.");
                    guesses++;
                } else {
                    System.out.println("Invalid guess!");
                }
            }
        }
        System.out.printf("You guessed the correct number in %d tries!", guesses);
    }
}
