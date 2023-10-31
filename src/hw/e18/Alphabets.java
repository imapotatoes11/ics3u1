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
 * The following program continually asks for a letter, and stops when a non-character
 * letter is entered. Then it outputs the number of upper case, lower case, and vowels entered.
 * */
package hw.e18;

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        // initialize variables
        char letter = ' ';
        int upper = 0;
        int lower = 0;
        int vowels = 0;
        Scanner sc = new Scanner(System.in);

        // ask user for input
        System.out.print("Enter a letter: ");
        letter = sc.next().charAt(0);

        // loop until a non-character letter is entered
        while (Character.isLetter(letter)) {
            if (Character.isUpperCase(letter)) {
                upper++;
            } else {
                lower++;
            }
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowels++;
            }
            System.out.print("Enter a letter: ");
            letter = sc.next().charAt(0);
        }

        // print out the results
        System.out.println("Number of upper case letters: " + upper);
        System.out.println("Number of lower case letters: " + lower);
        System.out.println("Number of vowels: " + vowels);
    }
}
