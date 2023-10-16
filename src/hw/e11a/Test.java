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
 * Oct 13, 2023
 * The following program checks for a given mark/score
 * */
package hw.e11a;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // instantiate a scanner object to read user input
        Scanner sc = new Scanner(System.in);
        int testMark;

        // ask user for a mark
        System.out.printf("Enter a test mark: ");
        testMark = sc.nextInt();

        // decide on mark and output to user
        if (testMark > 100) {
            System.out.println("The mark is above range.");
        } else if (testMark < 0) {
            System.out.println("The mark is below range.");
        } else if (testMark < 50) {
            System.out.println("The mark is failing. :(");
        } else {
            System.out.println("The mark is passing. :)");
        }
    }
}
