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
 * Oct 27, 2023
 * The following program asks the user for a width and height and prints out a
 * rectangle of that size.
 * */
package hw.e19;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // initialize variables
        Scanner sc = new Scanner(System.in);
        int width, height;
        int i = 0;
        int j = 0;

        // ask user for input
        System.out.print("Enter width: ");
        width = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextInt();

        // print out the rectangle
        while (i < height) {
            while (j < width) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
    }
}
