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
* The program compares two strings using the String.compareTo() method
* */
package hw.e28;

import java.util.Scanner;

public class Alphabetical {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        String a, b;

        // ask user for strings
        System.out.print("Enter the first string: ");
        a = sc.nextLine();
        System.out.print("Enter the second string: ");
        b = sc.nextLine();

        // compare strings and return to user
        switch (a.compareTo(b)) {
            case -1 -> {
                System.out.println("The first string is alphabetically first.");
            } case 0 -> {
                System.out.println("The first string is equal to the second string.");
            } case 1 -> {
                System.out.println("The first string is alphabetically last.");
            }
        }
    }
}
