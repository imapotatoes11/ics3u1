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
 * The following program is a while loop that counts numbers from a to b.
 * */
package hw.e14;

import java.rmi.UnexpectedException;
import java.util.Scanner;

public class Count3 {
    public static void main(String[] args) throws UnexpectedException {
        // instantiate objects
        Scanner sc = new Scanner(System.in);
        long a, b;

        // ask user for numbers
        System.out.printf("Enter the a: ");
        a = sc.nextLong();
        System.out.printf("Enter the b: ");
        b = sc.nextLong();

        // check if a is less than b
        if (a > b) {
            throw new UnexpectedException(
                    "a is larger than b.\na cannot be larger than b"
            );
        }

        // the loop
        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }
}
