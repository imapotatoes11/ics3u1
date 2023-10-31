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
 * The following program utilizes a for loop to count down
 * from 100 to a given number by the user by 5s.
 * */
package hw.e17;

import java.util.Scanner;

public class Backward2 {
    public static void main(String[] args) {
        // initialize objects
        int num = 100;
        Scanner sc = new Scanner(System.in);
        int min;

        // prompt user for input
        System.out.print("Enter a number: ");
        min = sc.nextInt();

        // print num and constantly subtract 5 until
        // num < min
        for (int i = num; i > min; i -= 5) {
            System.out.println(i);
        }
    }
}
