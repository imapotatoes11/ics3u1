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
 * Dec. 07, 2023
 * The program has two methods for calucalting length and slope
 * */
package hw.e33;

public class Line {
    /**
     * Calculate length using distance formula (given 2 points)
     * @param x1 1st coordinate x value (integer)
     * @param y1 1st coordinate y value (integer)
     * @param x2 2nd coordinate x value (integer)
     * @param y2 2nd coordinate y value (integer)
     * @return length as a double
     */
    public static double length(int x1, int y1, int x2, int y2) {
        // create a result variable for the result to be
        // stored in (double type for decimal precision)
        double result;

        // use the distance formula to calculate length
        // dt = sqrt((x1-x2)^2 + (y1-y2)^2)
        result = Math.sqrt(
            Math.pow((x1 - x2), 2f) +
            Math.pow((y1 - y2), 2f)
        );

        // return result
        return result;
    }

    /**
     * calculate linear slope via rise/run (given two points)
     * @param x1 1st coordinate x value (integer)
     * @param y1 1st coordinate y value (integer)
     * @param x2 2nd coordinate x value (integer)
     * @param y2 2nd coordinate y value (integer)
     * @return slope (double)
     */
    public static double slope(int x1, int y1, int x2, int y2) {
        // create a result variable for the result to be
        // stored in (double for decimal precision)
        double result;

        // use the slope formula to calaculate slope:
        // (y2-y1) / (x2-x1)
        result = (double)(y2 - y1) /
                (double)(x2 - x1);

        // return result
        return result;
    }
    public static void main(String[] args) {
        System.out.println(length(1,2,3,4));
        System.out.println(slope(1,2,3,4));
    }
}
