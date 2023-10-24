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
 * The following program finds the closest power of two to
 * the user-inputted number.
 * */
package hw.e14;

import java.util.Scanner;

public class LeastTwoPower {
    public static void main(String[] args) {
        // instantiate objects
        Scanner sc = new Scanner(System.in);
        // variable `two` is a long in case user enters
        // a number where the result is larger than the
        // 32-bit limit (2,147,483,647)
        long two;
        int num;

        // ask user for number
        System.out.printf("Enter a number: ");
        num = sc.nextInt();

//        // continuously multiply two by 2 until it is larger than
//        // the number the user inputted.
//        while (two < num) {
//            two *= 2;
//        }
        // more efficient method to determine the closest power
        two = (long) Math.pow(2, Math.ceil(Math.log(num)/Math.log(2)));

        // output result to user
        System.out.println(two);
    }
}
