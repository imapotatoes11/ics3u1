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
* The program returns the length of a given string.
* */
package hw.e28;

import java.util.Scanner;

public class StringLen {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        String str;

        // ask user for string
        System.out.print("Enter a string: ");
        str = sc.next();

        // use the String.length() method to determine
        // the length of the string
        System.out.println("The length of the string is " + str.length());
    }
}
