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
* The program asks the user for integer b and e, and outputs
* b to the power of e
* */
package hw.e26;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        // initialize objects
        // no clarification was provided, so
        // integer values for both b and e are
        // assumed.
        int b, e;
        Scanner sc = new Scanner(System.in);

        // ask user for the values of b and e
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();

        System.out.print("Enter the value of e: ");
        e = sc.nextInt();

        // calculate and return result to user
        // the result is casted as a long in
        // case the number exceeds the 32-bit
        // limit (2^63-1).
        System.out.printf("%d to the power of %d is %d.", b, e, (long)Math.pow(b, e));
    }
}
