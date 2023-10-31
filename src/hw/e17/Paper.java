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
 * The following program calculates the thickness of a given pile of paper
 * */
package hw.e17;

public class Paper {
    public static void main(String[] args) {
        // Suppose that a large piece of paper with an area of 1.0m2 and a thickness of 0.090 mm is cut in half and the two pieces are stacked, one on top of the other.  Suppose further that the process of cutting in half and stacking is repeated over and over again.  Write a program to find both the thickness of the pile and the area of each piece after the procedure has been carried out forty times.
        // initialize variables
        double thickness = 0.00009;
        double area = 1.0;

        // print the header
        System.out.println("Iteration\tThickness\tArea");

        // print the chart
        for (int i = 1; i <= 40; i++) {
            System.out.println(i + "\t\t\t" + thickness + "\t\t\t" + area);
            thickness *= 2;
            area /= 2;

            // round values
            thickness = Math.round(thickness * 10000.0) / 10000.0;
            area = Math.round(area * 10000.0) / 10000.0;
        }
    }
}
