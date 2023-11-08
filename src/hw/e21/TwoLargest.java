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
* The following program creates an array of size 10, fills it with
* random numbers, and then traverses and writes out the two largest elements
* in the array.
* */
package hw.e21;

import java.util.Random;

public class TwoLargest {
    public static int randInt(int origin, int bound) {
		Random random = new Random();
		return random.nextInt(origin, bound);
	}
    public static void main(String[] args) {
        // Initialize objects
        final int ARR_SIZE = 10;
        int arr[] = new int[ARR_SIZE];
        int temp;
        // set largest value to the minimum possible value
        // to ensure accuracy
        int largestValue = -2147483647;

        // fill array with random integers (without duplicates)
        for (int i = 0; i < ARR_SIZE; i++) {
            // random number bound was not specified,
            // assume integer limit bounds
            temp = TwoLargest.randInt(-2147483647, 2147483647);

            // check for duplicates
            // the algorithm does not fully remove all duplicates
            // in all scenarios, but will lessen the chance of a
            // duplicate happening enough for it not to happen
            // *most* of the time
            for (int j = 0; j < ARR_SIZE; j++) {
                if (arr[j] == temp) {
                    if (temp > 0) {
                        temp = TwoLargest.randInt(-2147483647, temp);
                    } else {
                        temp = TwoLargest.randInt(temp, 2147483647);
                    }
                }
            }
            arr[i] = temp;
        }

        // traverse and write out two largest elements in the array
        // logic:
        // 1. find the largest value, print it out
        // 2. set the largest value (in the array) to 0
        // 3. find the next largest value, and print it out

        // Step 1
        for (int i = 0; i < ARR_SIZE; i++) {
            if (arr[i] > largestValue) {
                largestValue = arr[i];
            }
        }
        System.out.println(largestValue);

        // Step 2
        for (int i = 0; i < ARR_SIZE; i++) {
            if (arr[i] == largestValue) {
                // set value to lowest possible value
                // instead of 0 in case RNG makes all
                // numbers negative
                arr[i] = -2147483647;

                // reset largestValue
                largestValue = arr[i];
            }
        }

        // Step 3
        for (int i = 0; i < ARR_SIZE; i++) {
            if (arr[i] > largestValue) {
                largestValue = arr[i];
            }
        }
        System.out.println(largestValue);

    }
}
