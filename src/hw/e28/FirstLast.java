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
* The program asks the user for a string and returns the first and last character
* of the string.
* */
package hw.e28;

import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        String str;

        // Ask user for a string and store
        // to String `str`
        System.out.print("Enter a string: ");
        str = sc.nextLine();

        // output result to user
        System.out.printf("The first char is %s and the last char is %s.",
                str.charAt(0), str.charAt(str.length() - 1));
    }
}
