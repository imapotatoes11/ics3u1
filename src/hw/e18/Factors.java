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
 * The following program asks the user for an integer and prints out all of
 * its factors.
 * */
package hw.e18;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // initialize variables
        int num = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);

        // ask user for input
        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        // print out the factors
        while (i <= num) {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
