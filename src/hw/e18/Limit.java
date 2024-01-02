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
 * The following program computes the following sum:
 * 1.0/1 + 1.0/2 + 1.0/3 + ... + 1.0/N
 * where N is an integer the limit the user enters
 * */
package hw.e18;

import java.util.Scanner;

public class Limit {
    public static void main(String[] args) {
        // initialize variables
        int limit = 0;
        int i = 1;
        double sum = 0;
        Scanner sc = new Scanner(System.in);

        // ask user for input
        System.out.print("Enter a positive integer N: ");
        limit = sc.nextInt();

        // compute the sum
        while (i <= limit) {
            sum += 1.0 / i;
            i++;
        }

        // print out the results
        System.out.println("Sum: " + sum);
    }
}
