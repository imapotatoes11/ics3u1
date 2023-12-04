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
* The program adds the sum of each digit
* */
package hw.e30;

import java.util.Scanner;

public class AddDigits {
    /**
     * Given an integer value `String str`, returns the sum of
     * the digits of `String str`. Will throw `NumberFormatException`
     * if string values are not numerical.
     * @param str input string with numerical values
     * @return sum of digits in str
     */
    public static int sumOfDigits(String str) throws NumberFormatException {
        // set sum to 0 and create a char array
        // of the string
        int sum = 0;
        char[] string = str.toCharArray();

        // iterate through each character and use
        // Integer.parseInt() to parse the numerical
        // value, and add it to `sum`
        for (char i: string) {
            sum += Integer.parseInt(String.valueOf(i));
        }

        // return integer sum of digits
        return sum;
    }

    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        String str; int sum;

        // ask user for a number but store it as
        // a string
        System.out.print("Enter a number");
        str = sc.nextLine();

        // call the sumOfDigits() method and return
        // result to user.
        sum = AddDigits.sumOfDigits(str);
        System.out.printf("The sum of digits is %d", sum);
    }
}
