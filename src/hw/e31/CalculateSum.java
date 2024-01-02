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
 * Dec 01, 2023
 * The program calculates the sum within a range
 * */
package hw.e31;

public class CalculateSum {
    /**
     * calculate the sum of an integer array
     * @param i the integer array
     * @return sum of values of integer array
     */
    public static int sum(int[] i) {
        // set sum to 0, and add each element to sum
        int sum = 0;

        // iterate through the array and
        // add each element to sum
        for (int j: i) {
            sum += j;
        }

        // return the sum
        return sum;
    }

    /**
     * calculates the sum of integers between a and b
     * @param a first integer (lower bound)
     * @param b second integer (upper bound)
     * @return integer sum
     */
    public static int sumRange(int a, int b) {
        // return 0 and print an error message to console
        // if the second number is less than the first number
        if (b < a) {
            System.out.println("Error: 2nd number is less than 1st number");;
            return 0;
        } else {
            // call the sum() method with an integer array
            // from range()
            return CalculateSum.sum(range(a, b));
        }
    }
    /**
     * Returns an int array from lbound to rbound
     * @param lbound The lower bound of the range
     * @param rbound The upper bound of the range
     * @return An int array from lbound to rbound
     */
    private static int[] range(int lbound, int rbound) {
        int[] a = new int[rbound - lbound];
        for (int i = lbound; i < rbound; i++) {
            a[i-lbound] = i;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(sumRange(50, 75));
    }
}
