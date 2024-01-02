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
* Nov 02, 2023
* The following program operates on two arrays of values
* */
package hw.e20;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        // initialize objects
        final int LENGTH = 4;
        Scanner sc = new Scanner(System.in);
        String[] name = new String[LENGTH];
        int[] mark = new int[LENGTH];
        int askMark;

        // fill name and mark with values from user
        for (int i = 0; i < LENGTH; i++) {
            System.out.print("Enter name: ");
            name[i] = sc.next();
            System.out.print("Enter mark: ");
            mark[i] = sc.nextInt();
        }

        // try to find the mark the user gives
        System.out.printf("Enter a mark: ");
        askMark = sc.nextInt();
        for (int i = 0; i < LENGTH; i++) {
            if (mark[i] == askMark) {
                System.out.println(name[i]);
                System.exit(0);
            }
        }
        System.out.println("The mark was not found.");
    }
}
