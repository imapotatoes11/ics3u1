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
* The following program asks the user for a series of 20 heights
* and outputs all those who are above average in the group
* */
package hw.e20;

import java.util.ArrayList;
import java.util.Scanner;

public class Height {
    private static double getAverage(int[] arr) {
        // getAverage method returns the average of the values
        // in integer array `arr` using the following formula:
        //   \bar{n} = \frac{1}{x} \sum_{i=1}^{x} n_i
        int sum = 0;
        for (int i: arr) {
            sum += i;
        } return (double)sum / arr.length;
    }
    public static void main(String[] args) {
        // initialize objects
        final int LENGTH = 20;
        Scanner sc = new Scanner(System.in);
        double average;
        int[] heights = new int[LENGTH];
        ArrayList<Integer> aboveAverage = new ArrayList<Integer>();

        // ask user for heights
        for(int i = 0; i < LENGTH; i++) {
            System.out.print("Enter height: ");
            heights[i] = sc.nextInt();
        }

        // calculate average height
        average = Height.getAverage(heights);

        // for each element in heights:
        //   if the height is greater than average,
        //   add value to `aboveAverage`
        for(int height: heights) {
            if (height > (int)average) {
                aboveAverage.add(height);
            }
        }

        // return result to user
        System.out.println("The heights that are above average are: ");
        for (Object height: aboveAverage.toArray()) {
            System.out.println(height);
        }
    }
}
