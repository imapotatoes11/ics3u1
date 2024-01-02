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
 * The following program utilizes a do-while loop to continuously
 * add user-entered values to a sum, until the user enters a negative
 * value.
 * */
package hw.e15;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // initialzie objects
        Scanner sc = new Scanner(System.in);
        int sum = 0; int ans = 0;

        // add answer to sum, and ask user for number.
        // exit loop if number is negative
        do {
            sum += ans;

            System.out.printf("Enter a number: ");
            ans = sc.nextInt();
        } while (ans > 0);

        // return result to user
        System.out.println(sum);
    }
}
